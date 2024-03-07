package com.fsse2401.lab_b02_redo_redo.Data.Dto.Course;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.CourseResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Response.PersonResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Person.Response.PersonResponseDto;

import java.util.List;

public class CourseResponseDto {
    @JsonProperty ("course_id")
    private String courseId;
    @JsonProperty ("course_name")
    private String name;
    private double price;
    @JsonProperty ("teacher_id")
    private PersonResponseDto teacher;
    private List<PersonResponseDto> students;

    public CourseResponseDto(CourseResponseData data) {
        this.courseId = data.getCourseId();
        this.name = data.getName();
        this.price = data.getPrice();
        this.teacher = new PersonResponseDto(data.getTeacher());;

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

    public PersonResponseDto getTeacher() {
        return teacher;
    }

    public void setTeacher(PersonResponseDto teacher) {
        this.teacher = teacher;
    }

    public List<PersonResponseDto> getStudents() {
        return students;
    }

    public void setStudents(List<PersonResponseDto> students) {
        this.students = students;
    }
}
