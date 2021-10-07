package ChapterThree;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private int height;
    private int weight;

    public HealthProfile(String firstName, String lastName, String gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int age(int year){
        int currentAge = 2021 - year;
        return currentAge;
    }

    public int maximumHeartRate(int age){
        int maxHeartRate = 220 - age;
        return maxHeartRate;
    }

    public int targetHeartRate(int maxH){
        int targetHr = maxH/2;
        return targetHr;
    }

    public double bMi(int weight, int height){
        int bmi = (weight * 703) / (height * height);
        return bmi;
    }




}
