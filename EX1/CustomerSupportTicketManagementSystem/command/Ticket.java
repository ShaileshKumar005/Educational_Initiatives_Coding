package Educational_Initiatives_Coding.EX1.CustomerSupportTicketManagementSystem.command;

public class Ticket {
    private int id;
    private String eventName;
    private int totalTickets;
    private int availableTickets;

    public Ticket(int id, String eventName, int totalTickets) {
        this.id = id;
        this.eventName = eventName;
        this.totalTickets = totalTickets;
        this.availableTickets = totalTickets;
    }

    public int getId() {
        return id;
    }

    public void book(int numberOfTickets) throws Exception {
        if (numberOfTickets <= 0 || numberOfTickets > availableTickets) {
            throw new Exception("Invalid number of tickets.");
        }
        availableTickets -= numberOfTickets;
    }

    public void cancel(int numberOfTickets) throws Exception {
        if (numberOfTickets <= 0 || availableTickets + numberOfTickets > totalTickets) {
            throw new Exception("Invalid number of tickets.");
        }
        availableTickets += numberOfTickets;
    }

    public boolean checkAvailability() {
        return availableTickets > 0;
    }

    @Override
    public String toString() {
        return "Ticket{id=" + id + ", eventName='" + eventName + "', availableTickets=" + availableTickets + "}";
    }
}
