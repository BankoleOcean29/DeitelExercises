package ChapterFour;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many hours did you work for this week");
        int hoursWorked = input.nextInt();
        System.out.println("How much do you earn per hour");
        double wagePerHour = input.nextDouble();
        double wagePerWeek = 0;

        if (hoursWorked > 40){
            double extra = (hoursWorked - 40) * (wagePerHour / 2);
            wagePerWeek = (wagePerHour * 40) + extra;
            System.out.println("Your gross pay for this week is: " + wagePerWeek);
        }else
            if(hoursWorked > 0 & hoursWorked < 41){
                wagePerWeek = wagePerHour * hoursWorked;
                System.out.println("Your gross pay for this week is: " + wagePerWeek);
            }

    }
}
