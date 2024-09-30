import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    double price = 0;
    double shipping = 0;

    System.out.print("Enter the price: ");
    price = in.nextDouble();

    if (price >= 100) {
      shipping = 0;
    } 
    else {
      shipping = price * 0.02;
    }
    
    System.out.println("Shipping cost: $" + shipping);
    System.out.println("Total cost: $" + (price + shipping));

   }
}
