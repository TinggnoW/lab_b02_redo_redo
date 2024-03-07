package com.fsse2401.lab_b02_redo_redo.Api;


import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.CourseResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.CreateCourseRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.GetCourseResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.UpdateCourseRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Course.CourseResponseDto;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Course.CreatCourseRequestDto;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Course.GetCourseResponseDto;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Course.UpdateCourseRequestDto;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Person.Response.GetallpeopleResponseDto;
import com.fsse2401.lab_b02_redo_redo.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseApi {

    @Autowired
    private final CourseService courseService;

    public CourseApi(CourseService courseService) {
        this.courseService = courseService;

    }

    @PostMapping("/course")
    public CourseResponseDto createCourse (@RequestBody CreatCourseRequestDto creatCourseRequestDto){

//        CreateCourseRequestData createCourseRequestData = new CreateCourseRequestData(creatCourseRequestDto);
//       CourseResponseData courseResponseData = courseService.createCourse(createCourseRequestData);
//       CourseResponseDto courseResponseDto = new CourseResponseDto(courseResponseData);
//       return courseResponseDto;
       return new CourseResponseDto(
          courseService.createCourse(
              new CreateCourseRequestData(
                  creatCourseRequestDto)));


    }

    @GetMapping("/course")
    public List<GetCourseResponseDto> getCourse (){
        List<GetCourseResponseData> getCourseResponseDatalist = courseService.getCourse();

        List<GetCourseResponseDto> dtoList = new ArrayList<>();

        for(GetCourseResponseData dto:getCourseResponseDatalist){

            GetCourseResponseDto responseDto = new GetCourseResponseDto(dto);

            dtoList.add(responseDto);
        }
        return dtoList;
    }

    @PutMapping("/course")
    public CourseResponseDto updateCourse (@RequestBody UpdateCourseRequestDto requestDto){
        UpdateCourseRequestData updateCourseRequestData = new UpdateCourseRequestData(requestDto);
        CourseResponseData courseResponseData = courseService.updatedata(updateCourseRequestData);
        return new CourseResponseDto(courseResponseData);
    }

    @DeleteMapping("/course/{courseid}")
    public CourseResponseDto deleteCourse (@PathVariable String courseid){
        CourseResponseData data = courseService.deletecourse(courseid);
        CourseResponseDto dto = new CourseResponseDto(data);
        return dto;
    }
}
