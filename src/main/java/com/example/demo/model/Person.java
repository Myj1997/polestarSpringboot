package com.example.demo.model;

import java.util.List;

public class Person {
    // 나의 인적사항
    // 객체 넣어도 됨
    // 반복문으로 들어갈거 생각해보기
    // (공통 이름) + 리스트 정보 + html 태그가 포함된 글 한 줄
    private String name;
    private String engName;
    private int age;
    private String phoneNum;
    private String email;
    private String gitHubLink;
    private String notionLink;
    private Academy academy;
    private List<SchoolList> schoolList; // 학력사항
    private List<String> skills; // 보유 기술

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGitHubLink() {
        return gitHubLink;
    }

    public void setGitHubLink(String gitHubLink) {
        this.gitHubLink = gitHubLink;
    }

    public String getNotionLink() {
        return notionLink;
    }

    public void setNotionLink(String notionLink) {
        this.notionLink = notionLink;
    }

    public Academy getAcademy() {
        return academy;
    }

    public void setAcademy(Academy academy) {
        this.academy = academy;
    }

    public List<SchoolList> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<SchoolList> schoolList) {
        this.schoolList = schoolList;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", engName='" + engName + '\'' +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", gitHubLink='" + gitHubLink + '\'' +
                ", notionLink='" + notionLink + '\'' +
                ", academy=" + academy +
                ", schoolList=" + schoolList +
                ", skills=" + skills +
                '}';
    }
}
