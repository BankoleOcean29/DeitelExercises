package ChapterFive;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers are you comparing");
        int firstNumber = input.nextInt();
        int[] holder = new int[firstNumber];

        System.out.println("enter array elements");
        for (int index = 0; index < holder.length; index++){
            holder[index] = input.nextInt();
        }

        System.out.println("Minimum number is " + smallestInteger(holder, firstNumber));




    }

    public static int smallestInteger(int[] numbers, int frequency){
        numbers = new int[frequency];
        int temp = 0;
        for(int index = 0; index < frequency; index++){
            for(int jIndex = index + 1; jIndex < frequency; jIndex++){
                if (numbers[index] > numbers[jIndex])
                {
                    temp = numbers[index];
                    numbers[index] = numbers[jIndex];
                    numbers[jIndex] = temp;
                }
            }
        }
        return numbers[0];

    }

}
