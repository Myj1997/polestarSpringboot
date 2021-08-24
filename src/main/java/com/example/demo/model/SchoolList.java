package com.example.demo.model;

import java.util.Date;

public class SchoolList {

    private String schoolName;
    private String schoolDate;
    private String major;
    private String division;

    public SchoolList() {
    }

    public SchoolList(String schoolName, String schoolDate, String major, String division) {
        this.schoolName = schoolName;
        this.schoolDate = schoolDate;
        this.major = major;
        this.division = division;
    }

    public String getSchoolName() {
        return schoolName;
    }


    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolDate() {
        return schoolDate;
    }

    public void setSchoolDate(String schoolDate) {
        this.schoolDate = schoolDate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "SchoolList{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolDate=" + schoolDate +
                ", major='" + major + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
