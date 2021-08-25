package com.example.demo.model.dto;

import java.util.List;

public class UserInfo {

    private Person person;
    private Academy academy;
    private List<SchoolList> schoolListList;
    private List<Skills> skills;

    public UserInfo(){
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Academy getAcademy() {
        return academy;
    }

    public void setAcademy(Academy academy) {
        this.academy = academy;
    }

    public List<SchoolList> getSchoolListList() {
        return schoolListList;
    }

    public void setSchoolListList(List<SchoolList> schoolListList) {
        this.schoolListList = schoolListList;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "person=" + person +
                ", academy=" + academy +
                ", schoolListList=" + schoolListList +
                ", skills=" + skills +
                '}';
    }
}
