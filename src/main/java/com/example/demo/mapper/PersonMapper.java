package com.example.demo.mapper;


import com.example.demo.model.dto.Academy;
import com.example.demo.model.dto.Person;
import com.example.demo.model.dto.SchoolList;
import com.example.demo.model.dto.Skills;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {

    Person selectPerson();

    List<SchoolList> selectSchoolList(int personNo);

    Academy selectAcademy(int personNo);

    List<Skills> selectSkillsList(int personNo);
}
