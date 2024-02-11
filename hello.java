import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean continueShopping = true;
        int stock1 = 30, stock2 = 30, stock3 = 30;
        double total = 0, total2 = 0, total3 = 0;
        while (continueShopping) {
            int product, quantity, quantity2, quantity3;
            System.out.println("Please choose the product"  + "\n" + 
                               "press 1 for $1 Apple, Available stock is: " + stock1 + "\n" +   
                               "press 2 for 1.5$ Grapes, Available stock is: " + stock2 + "\n" + 
                               "press 3 for 2$ Banana, Available stock is: " + stock3 + "\n" +
                               "press 4 for sell it");

            System.out.println("Please choose a number:");
            product = myObj.nextInt();

            switch (product) {
                case 1:
                    System.out.println("Enter a quantity for an apple");
                    do {
                        quantity = myObj.nextInt();
                        if (quantity <= stock1) {
                            total = quantity * 1;
                            stock1 -= quantity;
                            System.out.println("You have now: " + quantity + " for " + "$" + total);
                        } else {
                            System.out.println("The available stock is: " + stock1 + ". Please adjust your quantity.");
                            System.out.println("Enter a quantity for an apple");
                        }
                    } while (quantity > stock1);
                    break;

                case 2:
                    System.out.println("Enter a quantity for grapes");
                    do {
                        quantity2 = myObj.nextInt();
                        if (quantity2 <= stock2) {
                            total2 = quantity2 * 1.5;
                            stock2 -= quantity2;
                            System.out.println("You have now: " + quantity2 + " for " + "$" + total2);
                        } else {
                            System.out.println("The available stock is: " + stock2 + ". Please adjust your quantity.");
                            System.out.println("Enter a quantity for grapes");
                        }
                    } while (quantity2 > stock2);
                    break;

                case 3:
                    System.out.println("Enter a quantity for a banana");
                    do {
                        quantity3 = myObj.nextInt();
                        if (quantity3 <= stock3) {
                            total3 = quantity3 * 2;
                            stock3 -= quantity3;
                            System.out.println("You have now: " + quantity3 + " for " + "$" + total3);
                        } else {
                            System.out.println("The available stock is: " + stock3 + ". Please adjust your quantity.");
                            System.out.println("Enter a quantity for a banana");
                        }
                    } while (quantity3 > stock3);
                    break;

                    case 4:
                         double profit = total + total2 + total3;
                        System.out.println("Total profit you earn is: $" + profit);
                    break;
            }

            System.out.println("Do you want to continue shopping? (yes/no):");
            String choice = myObj.next();
            continueShopping = choice.equalsIgnoreCase("yes");
        }
    }
}
