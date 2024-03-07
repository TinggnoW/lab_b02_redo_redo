package com.fsse2401.lab_b02_redo_redo.Data.Domain.Course;

import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Response.PersonResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Person.Response.PersonResponseDto;
import com.fsse2401.lab_b02_redo_redo.Data.Entity.CourseEntity;

import java.util.List;

public class CourseResponseData {

    private String courseId;
    private String name;
    private double price;
    private PersonResponseData teacher;
    private List<PersonResponseData> students;

    public CourseResponseData(CourseEntity entity) {
        this.courseId = entity.getCourseId();
        this.name = entity.getName();
        this.price = entity.getPrice();
        this.teacher = new PersonResponseData(entity.getTeacher());

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

    public PersonResponseData getTeacher() {
        return teacher;
    }

    public void setTeacher(PersonResponseData teacher) {
        this.teacher = teacher;
    }

    public List<PersonResponseData> getStudents() {
        return students;
    }

    public void setStudents(List<PersonResponseData> students) {
        this.students = students;
    }
}
