package ChapterSix;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int firstNumber = input.nextInt();
        System.out.println("Enter another number");
        int secondNumber = input.nextInt();

        System.out.println(Exponentiation.integerPower(firstNumber, secondNumber));


    }

    public static int integerPower(int numberOne, int numberTwo) {
        int baseExponent = 1;
        for (int i = 0; i < numberTwo; i++)
            baseExponent *= numberOne;
        return baseExponent;

    }
}
