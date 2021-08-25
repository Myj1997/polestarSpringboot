package com.example.demo.controller.api;

import com.example.demo.model.dto.Academy;
import com.example.demo.model.dto.Person;
import com.example.demo.model.dto.SchoolList;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // api는 restController 어노테이션을 사용한다. 아래의 메소드들은 자동으로 리폰바 적용됨
@RequestMapping("/personApiTest")
public class PersonAPI {

    @GetMapping("/get")
    public Person restfulGet(Model model){

        // 보유 기술 리스트 객체 생성
        List<String> skills = new ArrayList<String>();
        skills.add("자바");
        skills.add("스프링");

        // 학교 객체 생성
        List<SchoolList> schoolList = new ArrayList<>();

        SchoolList highSchool = new SchoolList();
        highSchool.setSchoolDate("2016-03");
        highSchool.setSchoolName("구리 고등 학교");
        highSchool.setDivision("졸업");
        highSchool.setMajor("문과");

        SchoolList univ = new SchoolList();
        univ.setSchoolDate("2018-03");
        univ.setSchoolName("한서항공직업전문학교");
        univ.setDivision("졸업");
        univ.setMajor("항공정비과");

        schoolList.add(highSchool);
        schoolList.add(univ);

        // 학원 객체 생성
        Academy academy = new Academy();
        academy.setAcademyName("더조은 아이티 아카데미");
        academy.setProcessName("자바기반 안드로이드_A");
        academy.setTerm("2021-02 ~ 2021-07");
        academy.setDivision("수료");

        // Person 객체 생성
        Person person = new Person();
        person.setAge(25);
        person.setEmail("qpwlxk123@gamil.com");
        person.setEngName("Min Yeon Jun");
        person.setName("민연준");
        person.setNotionLink("notionLink.com");
        person.setGitHubLink("github.com");
        person.setPhoneNum("010-3339-9860");
//        person.setSkills(skills);
//        person.setAcademy(academy);
//        person.setSchoolList(schoolList);

        // 인텔리제이 utf-8 인코딩 검색 해보기
        System.out.println(person);

        model.addAttribute("person",person);

        return person;
    }

}
