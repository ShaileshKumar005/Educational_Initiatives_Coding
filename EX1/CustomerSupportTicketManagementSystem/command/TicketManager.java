package Educational_Initiatives_Coding.EX1.CustomerSupportTicketManagementSystem.command;

import java.util.HashMap;
import java.util.Map;

public class TicketManager {
    private Map<Integer, Ticket> tickets = new HashMap<>();

    public void addTicket(Ticket ticket) {
        tickets.put(ticket.getId(), ticket);
    }

    public Ticket getTicket(int id) {
        return tickets.get(id);
    }
}
