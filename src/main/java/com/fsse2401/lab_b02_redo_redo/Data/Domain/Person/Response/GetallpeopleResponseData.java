package com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Response;

import com.fsse2401.lab_b02_redo_redo.Data.Entity.PersonEntity;

public class GetallpeopleResponseData {
    private String lastName;
    private String firstName;
    private String hkid;

    public GetallpeopleResponseData(PersonEntity entity) {
        this.lastName = entity.getLastName();
        this.firstName = entity.getFirstName();
        this.hkid = entity.getHkid();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHkid() {
        return hkid;
    }

    public void setHkid(String hkid) {
        this.hkid = hkid;
    }
}
