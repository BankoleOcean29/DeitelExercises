package ChapterSix;

import java.util.Scanner;

public class IsMultiple {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers, to determine multiples");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();

        System.out.println(multiple(numberOne, numberTwo));

    }

    public static boolean multiple(int one, int two){
        if (two % one == 0){
            return true;
        }
        return false;
    }
}
