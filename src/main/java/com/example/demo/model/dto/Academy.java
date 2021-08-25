package com.example.demo.model.dto;

public class Academy {

    private int academyNo;
    private String term;
    private String academyName;
    private String processName;
    private String division;

    public Academy(){}

    public int getAcademyNo() {
        return academyNo;
    }

    public void setAcademyNo(int academyNo) {
        this.academyNo = academyNo;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getAcademyName() {
        return academyName;
    }

    public void setAcademyName(String academyName) {
        this.academyName = academyName;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Academy{" +
                "academyNo=" + academyNo +
                ", term='" + term + '\'' +
                ", academyName='" + academyName + '\'' +
                ", processName='" + processName + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
