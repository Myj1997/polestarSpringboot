package com.example.demo.controller.api;

import com.example.demo.model.dto.*;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // api는 restController 어노테이션을 사용한다. 아래의 메소드들은 자동으로 리폰바 적용됨
@RequestMapping("/personApi")
public class PersonAPI {

    private final PersonService personService;

    @Autowired
    public PersonAPI(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/addEduInfo")
    public UserInfo restfulGet(Model model){

        int personNo = 1;

        Person person = new Person();
        person = personService.selectPersonByPersonNo(personNo);

        List<SchoolList> schoolLists = new ArrayList<>();
        schoolLists = personService.selectSchoolList(personNo);

        Academy academy = personService.selectAcademy(personNo);

        List<Skills> skillsList = personService.selectSkillsList(personNo);

        UserInfo userInfo = new UserInfo();
        userInfo.setPerson(person);
        userInfo.setAcademy(academy);
        userInfo.setSkills(skillsList);
        userInfo.setSchoolListList(schoolLists);

        return userInfo;
    }


}
