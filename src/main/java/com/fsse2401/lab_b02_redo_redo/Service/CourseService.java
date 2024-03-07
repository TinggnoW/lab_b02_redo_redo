package com.fsse2401.lab_b02_redo_redo.Service;

import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.CourseResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.CreateCourseRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.GetCourseResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.UpdateCourseRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Course.UpdateCourseRequestDto;

import java.util.List;

public interface CourseService {
    CourseResponseData createCourse (CreateCourseRequestData createCourseRequestData);

    List<GetCourseResponseData> getCourse();

    CourseResponseData updatedata(UpdateCourseRequestData data);

    CourseResponseData deletecourse(String courseidnumber);

    CourseResponseData addstudent(String courseId, String hkid);
}
