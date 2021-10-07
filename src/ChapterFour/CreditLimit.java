package ChapterFour;

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hi, enter your account number, balance, items charged, credits applied, and allowed credit limit");
        int beginningBalance = input.nextInt();
        int charge = input.nextInt();
        int credit = input.nextInt();
        int cLimit = input.nextInt();

        CreditLimit.cLimitCalculator(beginningBalance, charge, credit, cLimit);

    }

    public static void cLimitCalculator(int balance, int charges, int credits, int creditLimit){
        double newBalance = balance + charges - credits;
        if(newBalance > creditLimit) System.out.println("Your new balance is " + newBalance);
        else
            System.out.println("Credit Limit exceeded, your balance is: " + newBalance);

    }
}
