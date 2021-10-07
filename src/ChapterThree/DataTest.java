package ChapterThree;

import java.util.Scanner;

public class DataTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Set the year");
        int currentYear = input.nextInt();

        System.out.println("Set the month");
        int currentMonth = input.nextInt();

        System.out.println("Set the day");
        int currentDay = input.nextInt();

        Date currentDate = new Date(currentDay, currentMonth, currentYear);

        currentDate.displayDate();
    }
}
