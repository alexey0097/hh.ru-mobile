package com.example.myapplication.objects;

import android.support.annotation.DrawableRes;

import java.io.Serializable;

abstract public class Work implements Serializable {

    private Long id;
    private int wageCount;
    private String wageType;
    private String profession;
    private int exepreinceYears;
    private String education;
    private int image;
    private String numberPhone;
    private String email;

    public Work(Long id, int wageCount, String wageType, String profession, int exepreinceYears, String education, int image, String numberPhone, String email) {
        this.id = id;
        this.wageCount = wageCount;
        this.wageType = wageType;
        this.profession = profession;
        this.exepreinceYears = exepreinceYears;
        this.education = education;
        this.image = image;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    protected String getYear(int age) {
        int ageLastNumber = age % 10;
        boolean isExclusion = (age % 100 >= 11) && (age % 100 <= 14);
        String old = "";

        if (ageLastNumber == 1)
            old = "год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old = "лет";
        else if(ageLastNumber >= 2 && ageLastNumber <= 4)
            old = "года";
        if (isExclusion)
            old = "лет";

        return old;
    }

    public Long getId() {return id;}

    public int getWageCount() { return wageCount; }

    public void setWageCount(int wageCount) { this.wageCount = wageCount; }

    public String getWageType() { return wageType; }

    public void setWageType(String wageType) { this.wageType = wageType; }

    public String getProfession() { return profession; }

    public void setProfession(String profession) { this.profession = profession; }

    public int getExepreinceYears() { return exepreinceYears; }

    public void setExepreinceYears(int exepreinceYears) { this.exepreinceYears = exepreinceYears; }

    public String getExperienceType() { return getYear(exepreinceYears); }

    public String getEducation() { return education; }

    public void setEducation(String education) { this.education = education; }

    public int getImage() { return image; }

    public void setImage(@DrawableRes int image) { this.image = image; }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
