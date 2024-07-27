package Educational_Initiatives_Coding.EX1.CustomerSupportTicketManagementSystem.command;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();
        TicketService ticketService = new TicketService(ticketManager);

        Ticket concertTicket = new Ticket(1, "Concert", 100);
        Ticket movieTicket = new Ticket(2, "Movie", 50);

        ticketManager.addTicket(concertTicket);
        ticketManager.addTicket(movieTicket);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command (book, cancel, check, exit):");
            String command = scanner.nextLine().toLowerCase();

            if (command.equals("exit")) {
                break;
            }

            System.out.println("Enter ticket ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.println("Enter number of tickets:");
            int numberOfTickets = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (command) {
                case "book":
                    ticketService.bookTicket(id, numberOfTickets);
                    break;
                case "cancel":
                    ticketService.cancelTicket(id, numberOfTickets);
                    break;
                case "check":
                    ticketService.checkTicketAvailability(id);
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }

        scanner.close();
    }
}
