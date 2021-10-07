package ChapterSix;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you want squared");
        int number = input.nextInt();
        System.out.println("Enter a character");
        char fill = input.next().charAt(0);
        asterisk(number, fill);


    }

    public static void asterisk(int number, char character){
        for (int i = 0; i < number; i++) System.out.println(character+character+character+character);
    }

}
