package ChapterFour;

import java.util.Formatter;
import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your 4 digit code for encryption");
        int passCode = userInput.nextInt();

        System.out.println(encrypt(passCode));

        System.out.println(decrypt(encrypt(passCode)));

    }

    public static Formatter encrypt(int data){
        Formatter formatter = new Formatter();
        int seriesOne = data / 1000;
        int seriesTwo = data % 1000;
        int seriesThree = seriesTwo / 100;
        int seriesFour = seriesTwo % 100;
        int seriesFive = seriesFour / 10;
        int seriesSix = seriesFour % 10;


        int encryptedOne = (seriesOne + 7) % 10;
        int encryptedTwo = (seriesThree + 7) % 10;
        int encryptedThree = (seriesFive + 7) % 10;
        int encryptedFour = (seriesSix + 7) % 10;

        Formatter encry = formatter.format("%d%d%d%d",encryptedThree, encryptedFour, encryptedOne, encryptedTwo);

        return encry;
    }

    public static int decrypt(Formatter passcode){

        return  2;

    }
}