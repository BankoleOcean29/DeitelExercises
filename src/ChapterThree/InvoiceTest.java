package ChapterThree;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, enter your product partnumber");
        String product = input.nextLine();
        System.out.println("part description please");
        String description = input.nextLine();
        System.out.println("quantity please");
        int theQuantity = input.nextInt();
        System.out.println("price please");
        double thePrice = input.nextDouble();

        Invoice customerInvoice = new Invoice(product, description, theQuantity, thePrice);

        System.out.println(customerInvoice.getPartDescription() + " " + customerInvoice.getPartNumber());
        System.out.println(customerInvoice.getInvoiceAmount(thePrice, theQuantity));
    }
}
