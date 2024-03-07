package com.fsse2401.lab_b02_redo_redo.Service.Impl;

import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.CourseResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.CreateCourseRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.GetCourseResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Course.UpdateCourseRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Entity.CourseEntity;
import com.fsse2401.lab_b02_redo_redo.Data.Entity.PersonEntity;
import com.fsse2401.lab_b02_redo_redo.Exception.CourseNotFoundException;
import com.fsse2401.lab_b02_redo_redo.Service.CourseService;
import com.fsse2401.lab_b02_redo_redo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private final PersonService personService;

    List<CourseEntity> courseEntityList = new ArrayList<>();

    public CourseServiceImpl(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public CourseResponseData createCourse(CreateCourseRequestData createCourseRequestData) {
        PersonEntity teacher = personService.checkHKID(createCourseRequestData.getTeacherHkid());
        CourseEntity courseEntity = new CourseEntity(createCourseRequestData, teacher);
        courseEntityList.add(courseEntity);
        CourseResponseData courseResponseData = new CourseResponseData(courseEntity);
        return courseResponseData;
    }

    @Override
    public List<GetCourseResponseData> getCourse() {
        List<GetCourseResponseData> getAllCourseResponseDataList = new ArrayList<>();
        for (CourseEntity entity : courseEntityList) {
            GetCourseResponseData data = new GetCourseResponseData(entity);
            getAllCourseResponseDataList.add(data );
        }
        return getAllCourseResponseDataList;
    }

    @Override
    public CourseResponseData updatedata(UpdateCourseRequestData data){

        PersonEntity teacher = personService.checkHKID(data.getTeacherHkid());
//        CourseEntity entity = new CourseEntity(data,teacher);
//        entity.setCourseId(data.getCourseId());
//        entity.setName(data.getName());
//        entity.setPrice(data.getPrice());
        CourseEntity courseEntity = courseid(data.getCourseId());
        courseEntity.setPrice(data.getPrice());
        courseEntity.setName(data.getName());
        courseEntity.setTeacher(teacher);
        return new CourseResponseData(courseEntity);

    }

    @Override
    public CourseResponseData deletecourse (String courseidnumber){
        CourseEntity courseEntity = courseid (courseidnumber);
        courseEntityList.remove(courseEntity);
        CourseResponseData result = new CourseResponseData(courseEntity);
        return result;
    }



    public CourseEntity courseid (String courseID){
        for (CourseEntity id:courseEntityList){
            if(id.getCourseId().equals(courseID)){
                return id;
            }
        }
        throw new CourseNotFoundException();
    }




}



