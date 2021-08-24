package com.example.demo.controller;

import com.example.demo.model.Academy;
import com.example.demo.model.Person;
import com.example.demo.model.SchoolList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

// 1. 컨트롤러 어노테이션 입력
@Controller
// 공통 url 설정
// url 과 directory 는 다르다
@RequestMapping("/polestar")
public class personController {

    // 2. http 매핑은 겟,포스트, 풋,딜리트
    // 겟 : 자원을 조회 / 포스트 : 정보를 날린다(데이터 요청이나 저장) / 풋 : 수정작업 / 딜리트 : 딜리트
    @GetMapping("/get")
    public String runIndex(Model model){

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
        person.setSkills(skills);
        person.setAcademy(academy);
        person.setSchoolList(schoolList);

        // 인텔리제이 utf-8 인코딩 검색 해보기
        System.out.println(person);

        model.addAttribute("person",person);

        return "indexV2";
    }


}
