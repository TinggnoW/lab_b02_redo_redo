package com.fsse2401.lab_b02_redo_redo.Data.Dto.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Response.CreatePersonResponseData;

public class CreatePersonResponseDto {
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("hkid_number")
    private String hkid;

    public CreatePersonResponseDto(CreatePersonResponseData responseData) {
        this.lastName = responseData.getLastName();
        this.firstName = responseData.getLastName();
        this.hkid = responseData.getHkid();
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
