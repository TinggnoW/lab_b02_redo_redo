package com.fsse2401.lab_b02_redo_redo.Data.Dto.Person.Request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePersonRequestDto {

    @JsonProperty ("last_name")
    private String lastName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("hkid_number")
    private String hkid;

    public CreatePersonRequestDto(String lastName, String firstName, String hkid) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.hkid = hkid;
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
