package com.example.myapplication.objects;

public class Vacancy extends Work {

    private String nameCompany;
    private String graphicWork;
    private String aboutCompany;
    private String aboutObyas;
    private String aboutTrebov;
    private String aboutUsl;

    public Vacancy(Long id, String nameCompany, int wageCount, String wageType, String profession, int exepreinceYears, String education, int image, String numberPhone, String email, String graphicWork, String aboutCompany, String aboutObyas, String aboutTrebov, String aboutUsl) {
        super(id, wageCount, wageType, profession, exepreinceYears, education, image, numberPhone, email);
        this.nameCompany = nameCompany;
        this.graphicWork = graphicWork;
        this.aboutCompany = aboutCompany;
        this.aboutObyas = aboutObyas;
        this.aboutTrebov = aboutTrebov;
        this.aboutUsl = aboutUsl;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getGraphicWork() {
        return graphicWork;
    }

    public void setGraphicWork(String graphicWork) {
        this.graphicWork = graphicWork;
    }

    public String getAboutCompany() {
        return aboutCompany;
    }

    public void setAboutCompany(String aboutCompany) {
        this.aboutCompany = aboutCompany;
    }

    public String getAboutObyas() {
        return aboutObyas;
    }

    public void setAboutObyas(String aboutObyas) {
        this.aboutObyas = aboutObyas;
    }

    public String getAboutTrebov() {
        return aboutTrebov;
    }

    public void setAboutTrebov(String aboutTrebov) {
        this.aboutTrebov = aboutTrebov;
    }

    public String getAboutUsl() {
        return aboutUsl;
    }

    public void setAboutUsl(String aboutUsl) {
        this.aboutUsl = aboutUsl;
    }
}
