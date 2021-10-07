package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mileage = 0;
        int gas = 0;

        do {
            System.out.println("Enter your miles driven for this trip. Or press -1 to exit.");
            mileage = input.nextInt();
            System.out.println("Enter the number of gallons of gas used for this trip. Or press -1 to exit");
            gas = input.nextInt();
            System.out.println("Enter -1 to view result");

        } while (input.nextInt() != -1);

        double milesPerGallon = mileage / gas;

        System.out.println("Your miles per gallon for this trip is: " + milesPerGallon);
    }
}
