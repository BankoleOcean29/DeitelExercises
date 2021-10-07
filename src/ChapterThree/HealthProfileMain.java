package ChapterThree;

import java.util.Scanner;

public class HealthProfileMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String fname = input.nextLine();

        System.out.println("Enter your last name");
        String lname = input.nextLine();

        System.out.println("Enter your gender");
        String gender = input.nextLine();

        System.out.println("Enter your Year of birth");
        int yearOfBirth = input.nextInt();

        System.out.println("Enter your Month of birth");
        int monthOfBirth = input.nextInt();

        System.out.println("Enter your day of birth");
        int dayOfBirth = input.nextInt();


        System.out.println("Enter your height (in inches)");
        int heightInInches = input.nextInt();

        System.out.println("Enter your weight (in pounds)");
        int weightInPounds = input.nextInt();

        HealthProfile personOne = new HealthProfile(fname, lname, gender, yearOfBirth, monthOfBirth, dayOfBirth, heightInInches, weightInPounds);

        int mHR = personOne.maximumHeartRate(personOne.age(yearOfBirth));



        System.out.println("BMI is: " + personOne.bMi(weightInPounds, heightInInches));
        System.out.println("Maximum heart rate is: " + personOne.maximumHeartRate(personOne.age(yearOfBirth)));
        System.out.println("Target heart rate is: " + personOne.targetHeartRate(personOne.maximumHeartRate(mHR)));



    }
}
