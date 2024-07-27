package Educational_Initiatives_Coding.EX1.Structural_Patterns.CoffeeShop_DecaratorPattern;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;



public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee = new BasicCoffee();
        //Coffee coffee1 = new BasicCoffee();
        boolean continueAdding = true;

        while (continueAdding) {
            try {
                System.out.println("Current coffee: " + coffee.getDescription());
                System.out.println("Cost: $" + coffee.cost());
                System.out.println("Add a feature: (1) Milk (2) Sugar (3) Whipped Cream (4) Chocolate (5) Vanilla (6) Finish");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount of milk (ml): ");
                        int milkQuantity = scanner.nextInt();
                        if (milkQuantity < 0) throw new IllegalArgumentException("Quantity cannot be negative.");
                        coffee = new MilkDecorator(coffee, milkQuantity);
                        break;
                    case 2:
                        System.out.print("Enter amount of sugar (tsp): ");
                        int sugarQuantity = scanner.nextInt();
                        if (sugarQuantity < 0) throw new IllegalArgumentException("Quantity cannot be negative.");
                        coffee = new SugarDecorator(coffee, sugarQuantity);
                        break;
                    case 3:
                        coffee = new WhippedCreamDecorator(coffee);
                        break;
                    case 4:
                        coffee = new ChocolateDecorator(coffee);
                        break;
                   
                    case 5:
                        continueAdding = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                        logger.warning("Invalid menu choice entered: " + choice);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                logger.severe("InputMismatchException caught: " + e.getMessage());
                scanner.next(); // Clear the invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                logger.severe("IllegalArgumentException caught: " + e.getMessage());
            }
        }

        System.out.println("Final coffee: " + coffee.getDescription());
        System.out.println("Final cost: $" + coffee.cost());
        scanner.close();
    }
}
