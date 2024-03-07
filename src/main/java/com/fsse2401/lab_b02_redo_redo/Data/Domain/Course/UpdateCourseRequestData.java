package com.fsse2401.lab_b02_redo_redo.Data.Domain.Course;

import com.fsse2401.lab_b02_redo_redo.Data.Dto.Course.UpdateCourseRequestDto;
import com.fsse2401.lab_b02_redo_redo.Data.Entity.PersonEntity;

public class UpdateCourseRequestData {
    private String courseId;
    private String name;
    private double price;
    private String teacherHkid;

    public UpdateCourseRequestData(UpdateCourseRequestDto dto) {
        this.courseId = dto.getCourseId();
        this.name = dto.getName();
        this.price = dto.getPrice();
        this.teacherHkid = dto.getTeacherHkid();
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

    public String getTeacherHkid() {
        return teacherHkid;
    }

    public void setTeacherHkid(String teacherHkid) {
        this.teacherHkid = teacherHkid;
    }
}
