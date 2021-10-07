package ChapterSix;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first side of the triangle");
        double sideA = input.nextDouble();
        System.out.println("Enter the second side of the triangle");
        double sideB = input.nextDouble();

        System.out.println("Hypotenuse of the given triangle is " + hypoten(sideA, sideB));


    }

    public static double hypoten(double firstSide, double secondSide){
        double sideOne = Math.pow(firstSide, 2);
        double sideTwo = Math.pow(secondSide, 2);
        double sideSum = sideOne + sideTwo;
        double squareRoot = Math.sqrt(sideSum);
        return squareRoot;
    }
}
