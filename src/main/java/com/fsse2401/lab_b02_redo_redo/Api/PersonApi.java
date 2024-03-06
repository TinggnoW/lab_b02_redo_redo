package com.fsse2401.lab_b02_redo_redo.Api;

import com.fsse2401.lab_b02_redo_redo.Data.Domain.Request.CreatePersonRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Request.UpdatePersonRequestData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Response.CreatePersonResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Response.GetallpeopleResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Domain.Response.PersonResponseData;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Request.CreatePersonRequestDto;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Request.UpdatePersonRequestDto;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Response.CreatePersonResponseDto;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Response.GetallpeopleResponseDto;
import com.fsse2401.lab_b02_redo_redo.Data.Dto.Response.PersonResponseDto;
import com.fsse2401.lab_b02_redo_redo.Data.Entity.PersonEntity;
import com.fsse2401.lab_b02_redo_redo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class PersonApi {

    @Autowired
    private final PersonService personService;

    public PersonApi(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/person")
    public CreatePersonResponseDto createPerson (@RequestBody CreatePersonRequestDto createPersonRequestDto){
        CreatePersonRequestData createPersonRequestData = new CreatePersonRequestData(
                createPersonRequestDto
        );

        CreatePersonResponseData createPersonResponseData = personService.createPerson(createPersonRequestData
        );

        CreatePersonResponseDto createPersonResponseDto = new CreatePersonResponseDto(
                createPersonResponseData
        );

        return createPersonResponseDto;



    }
    @GetMapping("/person")
    public List<GetallpeopleResponseDto> getPeople (){
        List<GetallpeopleResponseData> getallpeopleResponseDataList = personService.getallpeople();

        List<GetallpeopleResponseDto> dtoList = new ArrayList<>();

        for(GetallpeopleResponseData dto:getallpeopleResponseDataList){

            GetallpeopleResponseDto responseDto = new GetallpeopleResponseDto(dto);
            dtoList.add(responseDto);
        }
        return dtoList;
    }
    @PutMapping("/person")
    public PersonResponseDto updatePerson(@RequestBody UpdatePersonRequestDto updatePersonRequestDto){
        UpdatePersonRequestData updatePersonRequestData = new UpdatePersonRequestData(updatePersonRequestDto);
        PersonResponseData responseData = personService.updatePerson(updatePersonRequestData);
        PersonResponseDto dto = new PersonResponseDto(responseData);
        return dto;

    }
    @DeleteMapping("/person")
    public PersonResponseDto deletePerson(@RequestParam String hkid){

        PersonResponseData personResponseData = personService.deletPerson(hkid);
        PersonResponseDto personResponseDto = new PersonResponseDto(personResponseData);
        return personResponseDto;

    }

    @GetMapping("/person{lastname}")
    public List<PersonResponseDto> getbylastname (@PathVariable String lastname){
        List<PersonResponseDto> newlist = new ArrayList<>();
        List<PersonResponseData> dataList = personService.getpeoplebylastname(lastname);
        for(PersonResponseData result:dataList){
            PersonResponseDto responseDto = new PersonResponseDto(result);
            newlist.add(responseDto);
        }
        return newlist;

    }


}
