package com.fsse2401.lab_b02_redo_redo.Data.Dto.Person.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Person.Response.GetallpeopleResponseData;

public class GetallpeopleResponseDto {
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("hkid_number")
    private String hkid;


    public GetallpeopleResponseDto(GetallpeopleResponseData data) {
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
