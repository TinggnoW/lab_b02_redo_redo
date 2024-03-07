package com.fsse2401.lab_b02_redo_redo.Service;

import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Request.CreatePersonRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Request.UpdatePersonRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Response.CreatePersonResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Response.GetallpeopleResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Response.PersonResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Entity.PersonEntity;

import java.util.List;

public interface PersonService {
    CreatePersonResponseData createPerson(CreatePersonRequestData createPersonRequestData);

    List<GetallpeopleResponseData> getallpeople();

    public PersonResponseData updatePerson(UpdatePersonRequestData updatePersonRequestData);

    PersonResponseData deletPerson(String hkid);

    List<PersonResponseData> getpeoplebylastname(String lastname);

    PersonEntity checkHKID(String hkid);
}
