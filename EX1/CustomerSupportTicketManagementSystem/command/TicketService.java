package Educational_Initiatives_Coding.EX1.CustomerSupportTicketManagementSystem.command;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TicketService {
    private static final Logger logger = Logger.getLogger(TicketService.class.getName());
    private TicketManager ticketManager;

    public TicketService(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    public void bookTicket(int id, int numberOfTickets) {
        Ticket ticket = ticketManager.getTicket(id);
        if (ticket == null) {
            logger.log(Level.WARNING, "Ticket with ID " + id + " not found.");
            return;
        }

        try {
            ticket.book(numberOfTickets);
            logger.log(Level.INFO, "Successfully booked " + numberOfTickets + " tickets.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to book tickets.", e);
        }
    }

    public void cancelTicket(int id, int numberOfTickets) {
        Ticket ticket = ticketManager.getTicket(id);
        if (ticket == null) {
            logger.log(Level.WARNING, "Ticket with ID " + id + " not found.");
            return;
        }

        try {
            ticket.cancel(numberOfTickets);
            logger.log(Level.INFO, "Successfully canceled " + numberOfTickets + " tickets.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to cancel tickets.", e);
        }
    }

    public void checkTicketAvailability(int id) {
        Ticket ticket = ticketManager.getTicket(id);
        if (ticket == null) {
            logger.log(Level.WARNING, "Ticket with ID " + id + " not found.");
            return;
        }

        boolean available = ticket.checkAvailability();
        logger.log(Level.INFO, "Ticket availability for ID " + id + ": " + available);
    }
}
