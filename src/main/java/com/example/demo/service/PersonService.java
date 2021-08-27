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


    public Person selectPersonByPersonNo(int personNo) {
        return mapper.selectPersonByPersonNo(personNo);
    }

    public List<SchoolList> selectSchoolList(int personNo) {
        return mapper.selectSchoolListByPersonNo(personNo);
    }

    public Academy selectAcademy(int personNo) {
        return mapper.selectAcademyByPersonNo(personNo);
    }

    public List<Skills> selectSkillsList(int personNo) {
        return  mapper.selectSkillsListByPersonNo(personNo);
    }


    public String selectMyName(int personNo) {
        return mapper.selectMyName(personNo);
    }
}
