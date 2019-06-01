package work.chessman.mobile.objects;

import android.support.annotation.DrawableRes;

import java.io.Serializable;

abstract public class MainWorkData implements Serializable, Work {

    private Long id;
    private int wageCount;
    private String wageType;
    private String profession;
    private int exepreinceYears;
    private String education;
    private int image;
    private String numberPhone;
    private String email;

    public MainWorkData(Long id, int wageCount, String wageType, String profession, int exepreinceYears, String education, int image, String numberPhone, String email) {
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

    /**
     * Метод реализующий получение наименования у введенного количества лет.
     * Например: год, лет, года.
     *
     * @param age - количевсто лет.
     * @return наименования у введенного количества лет.
     */
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

    @Override
    public Long getId() {return id;}

    @Override
    public int getWageCount() { return wageCount; }

    public void setWageCount(int wageCount) { this.wageCount = wageCount; }

    @Override
    public String getWageType() { return wageType; }

    public void setWageType(String wageType) { this.wageType = wageType; }

    @Override
    public String getProfession() { return profession; }

    public void setProfession(String profession) { this.profession = profession; }

    @Override
    public int getExepreinceYears() { return exepreinceYears; }

    public void setExepreinceYears(int exepreinceYears) { this.exepreinceYears = exepreinceYears; }

    @Override
    public String getExperienceType() { return getYear(exepreinceYears); }

    @Override
    public String getEducation() { return education; }

    public void setEducation(String education) { this.education = education; }

    @Override
    public int getImage() { return image; }

    public void setImage(@DrawableRes int image) { this.image = image; }

    @Override
    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
