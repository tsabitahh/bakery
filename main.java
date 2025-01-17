import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner intro = new Scanner(System.in);
    System.out.println("What is your name?");

    String name = intro.nextLine();
    System.out.println("Welcome to Bakery " + name + "!");

    Scanner menu = new Scanner(System.in);
    System.out.println("What would you like to order?");
    System.out.println("1.Honey bread\n 2.Chocolate Eclair\n 3.Cinnamon Roll\n 4.Croissant\n 5.Egg Tart");
    
    int order = menu.nextInt();
    if (order == 1) {System.out.println("Your order is Honey Bread\n Total: $15");}
    if (order == 2) {System.out.println("Your order is Chocolate Eclair\n Total: $14.50");}
    if (order == 3) {System.out.println("Your order is Cinnamon Roll\n Total: $21");}
    if (order == 4) {System.out.println("Your order is Croissant\n Total: $10");}
    if (order == 5) {System.out.println("Your order is Egg Tart\n Total: $17.80");}
    
    Scanner method = new Scanner(System.in);
    System.out.println("Would you like to: \n 1.eat here \n 2.take-out");

    int choice = method.nextInt(); 
    if (choice == 1) {
      Scanner seat = new Scanner(System.in);
      System.out.println("Please enter your seat number!");
      String table = seat.nextLine();
      System.out.println("Your order will be ready in 5 minutes to the table " + table + "!");
    }

    if (choice == 2) {System.out.println("Thank you for ordering in Bakery, " + name + "!" + "Please wait in the waiting room.");}
  }
}
