package com.fsse2401.lab_b02_redo_redo.Data.Domain.Course;

import com.fsse2401.lab_b02_redo_redo.Data.Entity.CourseEntity;
import com.fsse2401.lab_b02_redo_redo.Data.Entity.PersonEntity;

public class GetCourseResponseData {
    private String courseId;
    private String name;
    private double price;
    private PersonEntity teacherHkid;

    public GetCourseResponseData(CourseEntity entity) {
        this.courseId = entity.getCourseId();
        this.name = entity.getName();
        this.price = entity.getPrice();
        this.teacherHkid = entity.getTeacher();
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

    public PersonEntity getTeacherHkid() {
        return teacherHkid;
    }

    public void setTeacherHkid(PersonEntity teacherHkid) {
        this.teacherHkid = teacherHkid;
    }
}
