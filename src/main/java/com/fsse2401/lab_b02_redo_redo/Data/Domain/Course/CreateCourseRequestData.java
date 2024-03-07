package com.fsse2401.lab_b02_redo_redo.Data.Domain.Course;

import com.fsse2401.lab_b02_redo_redo.Data.Dto.Course.CreatCourseRequestDto;

public class CreateCourseRequestData {
    private String courseId;
    private String name;
    private double price;
    private String teacherHkid;

    public CreateCourseRequestData(CreatCourseRequestDto dto) {
        this.courseId = dto.getCourseId();
        this.name = dto.getName();
        this.price = dto.getPrice();
        this.teacherHkid = dto.getTeacherHkid();
    }

    public CreateCourseRequestData(String courseId, String name, double price, String teacherHkid) {
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
