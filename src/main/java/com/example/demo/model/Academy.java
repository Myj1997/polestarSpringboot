package com.example.demo.model;

public class Academy {

    private String term;
    private String academyName;
    private String processName;
    private String division;

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
                "term='" + term + '\'' +
                ", academyName='" + academyName + '\'' +
                ", processName='" + processName + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
