package com.example.demo.model.dto;

import java.util.Date;

public class SchoolList {

    private int schoolNo;
    private String schoolName;
    private String schoolDate;
    private String major;
    private String division;

    public SchoolList() {
    }

    public int getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(int schoolNo) {
        this.schoolNo = schoolNo;
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
                "schoolNo=" + schoolNo +
                ", schoolName='" + schoolName + '\'' +
                ", schoolDate='" + schoolDate + '\'' +
                ", major='" + major + '\'' +
                ", division='" + division + '\'' +
                '}';
    }


}
