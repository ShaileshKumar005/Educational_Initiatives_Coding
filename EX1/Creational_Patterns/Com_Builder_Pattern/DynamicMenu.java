package Educational_Initiatives_Coding.EX1.Creational_Patterns.Com_Builder_Pattern;

import java.util.Scanner;

public class DynamicMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Please choose an option:");
                System.out.println("1. Create Gaming Computer");
                System.out.println("2. Create Office Computer");
                System.out.println("3. Exit");

                int choice = getUserChoice(scanner);
                switch (choice) {
                    case 1:
                        Computer gamingComputer = ComputerFactory.createGamingComputer();
                        System.out.println("Gaming Computer created: " + gamingComputer);
                        LoggerUtil.logInfo("Gaming Computer created.");
                        break;
                    case 2:
                        Computer officeComputer = ComputerFactory.createOfficeComputer();
                        System.out.println("Office Computer created: " + officeComputer);
                        LoggerUtil.logInfo("Office Computer created.");
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        LoggerUtil.logWarning("Invalid choice entered.");
                }
            } catch (Exception e) {
                LoggerUtil.logError("An error occurred: ", e);
            }
        }
    }

    private static int getUserChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // clear the invalid input
        }
        return scanner.nextInt();
    }
}
