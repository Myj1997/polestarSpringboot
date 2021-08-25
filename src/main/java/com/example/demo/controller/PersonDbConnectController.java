package com.example.demo.controller;

import com.example.demo.model.dto.*;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/polestarStudy")
public class PersonDbConnectController {
    private final PersonService personService;

    @Autowired
    public PersonDbConnectController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/selectPerson")
    public String selectPerson(Model model){

        int personNo = 1;

        Person person = new Person();
        person = personService.selectPerson();

        List<SchoolList> schoolLists = new ArrayList<>();
        schoolLists = personService.selectSchoolList(personNo);

        Academy academy = personService.selectAcademy(personNo);

        List<Skills> skillsList = personService.selectSkillsList(personNo);

        UserInfo userInfo = new UserInfo();
        userInfo.setPerson(person);
        userInfo.setAcademy(academy);
        userInfo.setSkills(skillsList);
        userInfo.setSchoolListList(schoolLists);

        model.addAttribute("userInfo",userInfo);
        return "index_V3";
    }



}
