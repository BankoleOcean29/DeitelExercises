package ChapterFive;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        do{
        System.out.println("Enter the product number or press -1 to exit");
        int prodNumb = input.nextInt();
        System.out.println("Enter the quantity sold or press -1 to exit");
        int qnty = input.nextInt();

        System.out.println(Sales.totalSales(prodNumb, qnty));}
        while (input.nextInt() != -1);



    }

    public static double totalSales(int productNumber, int quantity){
        double total = 0;
        double exception = 0;
        if (productNumber == 1){ total = quantity * 2.98;
            return total;}

        if (productNumber == 2){ total = quantity * 4.50;
            return total;}

        if (productNumber == 3){total = quantity * 9.98;
            return total;}

        if (productNumber == 4){total = quantity * 4.49;
            return total;}

        if (productNumber == 5){total = quantity * 6.87;
            return total;}

        return exception;
    }



}