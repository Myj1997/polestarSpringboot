package com.example.demo.mapper;


import com.example.demo.model.dto.Academy;
import com.example.demo.model.dto.Person;
import com.example.demo.model.dto.SchoolList;
import com.example.demo.model.dto.Skills;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {

    Person selectPersonByPersonNo(int personNo);

    List<SchoolList> selectSchoolListByPersonNo(int personNo);

    Academy selectAcademyByPersonNo(int personNo);

    List<Skills> selectSkillsListByPersonNo(int personNo);
}
