# Educational_Initiatives_Coding

EX 1

BEHAVIOURAL PATTERNS

HOME AUTOMATION WITH LIGHT USECASE
Command.java: Defines the Command interface with execute() and undo() methods, ensuring consistency for command objects.
Light.java: Represents the Light class with methods to turn the light on and off, acting as the "receiver" in the pattern.
LightOnCommand.java: Implements the Command interface to turn a specific light on, and includes an undo() method to turn it off.
LightOffCommand.java: Implements the Command interface to turn a specific light off, and includes an undo() method to turn it on.
RemoteControl.java: Manages and executes command objects, serving as the "invoker" that triggers commands based on user input.
![image](https://github.com/user-attachments/assets/e1e8d3c2-02d8-444c-b893-e5b058536e5c)


CUSTOMER SUPPORT TICKET MANAEMENT SYSTEM
The Ticket Management System allows users to book, cancel, and check the availability of tickets. It includes:

Ticket: Represents a ticket with properties such as event name, total tickets, and available tickets.
TicketManager: Manages the collection of tickets and provides methods to add, get, and remove tickets.
TicketService: Provides high-level services to book and cancel tickets using command objects.
AppLogger: Provides logging functionality to track operations and errors.
App: The main entry point for the application, where user interactions are handled.
![image](https://github.com/user-attachments/assets/8ad28e95-c1a7-452c-af2e-c7bfa53565ac)
