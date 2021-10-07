package ChapterFour;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many products of Item one sold for the week");
        int one = input.nextInt();
        System.out.println("Enter how many products of Item two sold for the week");
        int two = input.nextInt();
        System.out.println("Enter how many products of Item three sold for the week");
        int three = input.nextInt();
        System.out.println("Enter how many products of Item four sold for the week");
        int four = input.nextInt();

        System.out.println("Your commission for this week is: " + SalesCommission.calculateCommission(one, two, three, four));




    }


public static double calculateCommission(int itemOne, int itemTwo, int itemThree, int itemFour){
        double totalItemOne = 239.99 * itemOne;
        double totalItemTwo = 129.75 * itemTwo;
        double totalItemThree = 99.95 * itemThree;
        double totalItemFour = 350.89 * itemFour;

        double totalCommission = totalItemOne + totalItemTwo + totalItemThree + totalItemFour + 200;
        return totalCommission;

    }
}
