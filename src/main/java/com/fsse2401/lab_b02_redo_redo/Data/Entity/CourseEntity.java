package com.fsse2401.lab_b02_redo_redo.Data.Entity;

import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.CreateCourseRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.UpdateCourseRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Response.PersonResponseData;

import java.util.List;

public class CourseEntity {

    private String courseId;
    private String name;
    private double price;
    private PersonEntity teacher;
    private List<PersonEntity> students;

    public CourseEntity(CreateCourseRequestData data,PersonEntity teacher) {
        this.courseId = data.getCourseId();
        this.name = data.getName();
        this.price = data.getPrice();
        this.teacher = teacher;
    }

    public CourseEntity(UpdateCourseRequestData data, PersonEntity teacher) {
        this.courseId = data.getCourseId();
        this.name = data.getName();
        this.price = data.getPrice();
        this.teacher = teacher;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PersonEntity getTeacher() {
        return teacher;
    }

    public void setTeacher(PersonEntity teacher) {
        this.teacher = teacher;
    }

    public List<PersonEntity> getStudents() {
        return students;
    }

    public void setStudents(List<PersonEntity> students) {
        this.students = students;
    }
}
