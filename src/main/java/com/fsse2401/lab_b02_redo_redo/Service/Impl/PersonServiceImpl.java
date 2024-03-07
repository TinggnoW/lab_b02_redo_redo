package com.fsse2401.lab_b02_redo_redo.Service.Impl;

import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Request.CreatePersonRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Request.UpdatePersonRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Response.CreatePersonResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Response.GetallpeopleResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Response.PersonResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Entity.PersonEntity;
import com.fsse2401.lab_b02_redo_redo.Exception.PersonNotFoundException;
import com.fsse2401.lab_b02_redo_redo.Service.PersonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    List<PersonEntity> personEntityList = new ArrayList<>();

    @Override
    public CreatePersonResponseData createPerson(CreatePersonRequestData createPersonRequestData) {

        PersonEntity personEntity = new PersonEntity(
                createPersonRequestData
        );

        personEntityList.add(personEntity);

        return new CreatePersonResponseData(personEntity);


    }

    @Override
    public List<GetallpeopleResponseData> getallpeople() {
        List<GetallpeopleResponseData> getallpeopleResponseDataList = new ArrayList<>();

        for (PersonEntity entity : personEntityList) {

            GetallpeopleResponseData getallpeopleResponseData = new GetallpeopleResponseData(entity);
            getallpeopleResponseDataList.add(getallpeopleResponseData);

            // LV3  getallpeopleResponseDataList.add(new GetallpeopleData(entity));
        }
        return getallpeopleResponseDataList;

    }

    @Override
    public PersonResponseData updatePerson(UpdatePersonRequestData updatePersonRequestData) {
        PersonEntity personEntity = checkHKID(updatePersonRequestData.getHkid());
        personEntity.setLastName(updatePersonRequestData.getLastName());
        personEntity.setFirstName(updatePersonRequestData.getFirstName());

        //LV3
        return new PersonResponseData(personEntity);
//        //LV2
//        PersonResponseData responseData = new PersonResponseData(personEntity);
//        return responseData;
    }

    @Override
    public PersonResponseData deletPerson(String hkid) {
        PersonEntity personEntity = checkHKID(hkid);
        personEntityList.remove(personEntity);
        return new PersonResponseData(personEntity);

    }

    @Override
    public List<PersonResponseData> getpeoplebylastname(String lastname) {
        List<PersonResponseData> personResponseDataList = new ArrayList<>();
        for (PersonEntity entity : personEntityList) {
            if (entity.getLastName().equals(lastname)) {
                PersonResponseData result = new PersonResponseData(entity);
                personResponseDataList.add(result);
            }
        }
        return personResponseDataList;
    }

    @Override
    public PersonEntity checkHKID(String hkid) {
        for (PersonEntity personEntity : personEntityList) {
            if (personEntity.getHkid().equals(hkid))
                return personEntity;
        }
        throw new PersonNotFoundException();
    }


}
