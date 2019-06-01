package work.chessman.mobile.objects;

public class Resume extends MainWorkData {

    private String firstName;
    private String lastName;
    private String middleName;

    private int oldYears;
    public String getTypeYears() {
        return super.getYear(oldYears);
    }

    private String gender;

    private String aboutMe;
    private String aboutEucation;
    private String aboutExperience;

    public Resume(Long id, int wageCount, String wageType, String profession, int exepreinceYears, String education, int image, String numberPhone, String email, String firstName, String lastName, String middleName, int oldYears, String gender, String aboutMe, String aboutEucation, String aboutExperience) {
        super(id, wageCount, wageType, profession, exepreinceYears, education, image, numberPhone, email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.oldYears = oldYears;
        this.gender = gender;
        this.aboutMe = aboutMe;
        this.aboutEucation = aboutEucation;
        this.aboutExperience = aboutExperience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getOldYears() {
        return oldYears;
    }

    public void setOldYears(int oldYears) {
        this.oldYears = oldYears;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getAboutEucation() {
        return aboutEucation;
    }

    public void setAboutEucation(String aboutEucation) {
        this.aboutEucation = aboutEucation;
    }

    public String getAboutExperience() {
        return aboutExperience;
    }

    public void setAboutExperience(String aboutExperience) {
        this.aboutExperience = aboutExperience;
    }
}
