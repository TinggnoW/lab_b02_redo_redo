package com.fsse2401.lab_b02_redo_redo.Data.Domain.Request;

import com.fsse2401.lab_b02_redo_redo.Data.Dto.Request.CreatePersonRequestDto;

public class CreatePersonRequestData {
    private String lastName;
    private String firstName;
    private String hkid;

    public CreatePersonRequestData(CreatePersonRequestDto dto) {
        this.lastName = dto.getLastName();
        this.firstName = dto.getFirstName();
        this.hkid = dto.getHkid();
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
