package ChapterSix;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        int result = maximum(firstNumber, secondNumber, thirdNumber);

        System.out.println("Maximum number is " + result);
    }

    public static  int maximum(int one, int two, int three){
        int maximumValue = one;
        if (two > maximumValue)
            maximumValue = two;

        if (three > maximumValue)
            maximumValue = three;

        return maximumValue;
    }
}
