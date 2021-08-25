package com.example.demo.service;

import com.example.demo.mapper.PersonMapper;
import com.example.demo.model.dto.Academy;
import com.example.demo.model.dto.Person;
import com.example.demo.model.dto.SchoolList;
import com.example.demo.model.dto.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonMapper mapper;

    public PersonService(PersonMapper personMapper){
        this.mapper = personMapper;
    }


    public Person selectPerson() {
        return mapper.selectPerson();
    }

    public List<SchoolList> selectSchoolList(int personNo) {
        return mapper.selectSchoolList(personNo);
    }

    public Academy selectAcademy(int personNo) {
        return mapper.selectAcademy(personNo);
    }

    public List<Skills> selectSkillsList(int personNo) {
        return  mapper.selectSkillsList(personNo);
    }
}
