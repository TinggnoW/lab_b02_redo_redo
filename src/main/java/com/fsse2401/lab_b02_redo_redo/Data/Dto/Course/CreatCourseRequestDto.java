package com.fsse2401.lab_b02_redo_redo.Data.Dto.Course;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Person.Response.PersonResponseDto;

import java.util.List;

public class CreatCourseRequestDto {
    @JsonProperty("course_id")
    private String courseId;
    @JsonProperty("course_name")
    private String name;
    private double price;
    @JsonProperty("teacher_hkid")
    private String teacherHkid;

    public CreatCourseRequestDto(String courseId, String name, double price, String teacherHkid) {
        this.courseId = courseId;
        this.name = name;
        this.price = price;
        this.teacherHkid = teacherHkid;
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
