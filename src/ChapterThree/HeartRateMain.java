package ChapterThree;

import java.util.Scanner;

public class HeartRateMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String dfname = input.nextLine();
        System.out.println("Enter your last name");
        String dlname = input.nextLine();
        System.out.println("Enter your month of birth");
        int dmonth = input.nextInt();
        System.out.println("Enter your year of birth");
        int dyear = input.nextInt();
        System.out.println("Enter your day of birth");
        int dday = input.nextInt();

        HeartRates clientOne = new HeartRates(dfname, dlname, dday, dmonth, dyear);
        System.out.println(clientOne.getFirstName());
        System.out.println(clientOne.getLastName());
        System.out.println(clientOne.getDayOfBirth() + "/" + clientOne.getMonthOfBirth() + "/" + clientOne.getYearOfBirth());
        System.out.println(clientOne.age(dyear));
        System.out.println(clientOne.maximumHeartRate(clientOne.age(dyear)));
        System.out.println(clientOne.targetHeartRate(clientOne.maximumHeartRate(clientOne.age(dyear))));
    }
}
