package ChapterFour;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user_prompt;
        do {
            System.out.println("enter 1 or 3, to exit enter 5");
            user_prompt = input.nextInt();
            if(user_prompt == 1) System.out.println("number one, welcome");
            if(user_prompt == 3) System.out.println("hello number three");
        } while(user_prompt != 5);
    }
}