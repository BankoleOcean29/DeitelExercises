package ChapterFour;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradecounter = 1;

        while (gradecounter <= 10) {
            System.out.println("Enter student's score");
            int grade = input.nextInt();
            total = total + grade;
            gradecounter++;
        }



        int average = total/10;
        System.out.println("Class average is " + average);
    }
}