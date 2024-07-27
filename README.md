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

CREATIONAL PATTERNS
 Computer Builder with Factory and Logging
 1. Computer Class
Represents a fully configured computer object.

2. ComputerBuilder Class
 Facilitates the step-by-step construction of Computer objects.

3. ComputerFactory Class
 Provides methods for creating predefined Computer configurations.

4. LoggerUtil Class
Centralized logging utility for managing application logs.

5. DynamicMenu Class
 Interface for user interaction to create and manage Computer objects.
![image](https://github.com/user-attachments/assets/e5bd828c-2832-4d0a-815f-c141cfda4e1d)

Cloning UserProfile with Prototpe Pattern
UserProfile: Abstract base class defining user profile properties and the clone() method for cloning instances.

BasicUserProfile: Concrete implementation of UserProfile for basic profiles, including cloning functionality.

PremiumUserProfile: Concrete UserProfile implementation for premium profiles with additional features and cloning capability.

UserProfileRegistry: Manages and provides cloning of user profile prototypes based on their type.

UserProfileDemo: Demonstrates the usage of UserProfileRegistry for creating, cloning, and modifying user profiles.
![image](https://github.com/user-attachments/assets/0a6bb936-3f30-4caa-93a5-fade09136654)

















