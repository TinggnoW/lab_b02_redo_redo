package com.fsse2401.lab_b02_redo_redo.Data.Entity;

import com.fsse2401.lab_b02_redo_redo.Data.Domain.Request.CreatePersonRequestData;

public class PersonEntity {
    private String lastName;
    private String firstName;
    private String hkid;

    public PersonEntity(CreatePersonRequestData data) {
        this.lastName = data.getLastName();
        this.firstName = data.getFirstName();
        this.hkid = data.getHkid();
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
