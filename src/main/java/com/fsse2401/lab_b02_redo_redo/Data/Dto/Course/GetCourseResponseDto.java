package com.fsse2401.lab_b02_redo_redo.Data.Dto.Course;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.GetCourseResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Entity.PersonEntity;

public class GetCourseResponseDto {
    @JsonProperty("course_id")
    private String courseId;
    @JsonProperty("course_name")
    private String name;
    private double price;
    @JsonProperty("teacher_hkid")
    private PersonEntity teacherHkid;

    public GetCourseResponseDto(GetCourseResponseData data) {
        this.courseId = data.getCourseId();
        this.name = data.getName();
        this.price = data.getPrice();
        this.teacherHkid = data.getTeacherHkid();
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
