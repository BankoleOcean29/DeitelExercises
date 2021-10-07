package ChapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account("gLORY");
        //System.out.println("type in a name");
        //String theName = input.nextLine();
        //myAccount.setName(theName);

        System.out.println(myAccount.getName());
    }
}
