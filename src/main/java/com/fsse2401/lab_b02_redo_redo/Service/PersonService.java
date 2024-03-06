package com.fsse2401.lab_b02_redo_redo.Service;

import com.fsse2401.lab_b02_redo_redo.Data.Domain.Request.CreatePersonRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Request.UpdatePersonRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Response.CreatePersonResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Response.GetallpeopleResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Response.PersonResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Entity.PersonEntity;

import java.util.List;

public interface PersonService {
    CreatePersonResponseData createPerson(CreatePersonRequestData createPersonRequestData);

    List<GetallpeopleResponseData> getallpeople();

    public PersonResponseData updatePerson(UpdatePersonRequestData updatePersonRequestData);

    PersonResponseData deletPerson(String hkid);

    List<PersonResponseData> getpeoplebylastname(String lastname);
}
