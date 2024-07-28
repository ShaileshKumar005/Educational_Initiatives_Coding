# Educational_Initiatives_Coding

# EX 1

## BEHAVIOURAL PATTERNS :

HOME AUTOMATION WITH LIGHT USECASE

Customer Support Ticket Management
The Customer Support Ticket Management system uses the Observer pattern to notify relevant parties about ticket updates and the Chain of Responsibility pattern to route tickets through various handlers based on their type or severity. This design enables real-time updates and flexible ticket processing.

Home Automation - Light Use Case
The Home Automation - Light Use Case leverages the Command pattern to encapsulate light control operations as commands and the Strategy pattern to manage different light control algorithms based on user preferences or environmental conditions. This setup provides flexible and dynamic lighting management.

![image](https://github.com/user-attachments/assets/e1e8d3c2-02d8-444c-b893-e5b058536e5c)


CUSTOMER SUPPORT TICKET MANAEMENT SYSTEM :

The Ticket Management System allows users to book, cancel, and check the availability of tickets. It includes:

Ticket: Represents a ticket with properties such as event name, total tickets, and available tickets.
TicketManager: Manages the collection of tickets and provides methods to add, get, and remove tickets.
TicketService: Provides high-level services to book and cancel tickets using command objects.
AppLogger: Provides logging functionality to track operations and errors.
App: The main entry point for the application, where user interactions are handled.
![image](https://github.com/user-attachments/assets/8ad28e95-c1a7-452c-af2e-c7bfa53565ac)

## CREATIONAL PATTERNS :

Question creator with Factory Pattern :-

The primary goal is to provide a flexible and extensible framework for adding new question types without modifying the existing codebase.
Question.java: Interface defining methods for adding questions, answers, and marks for any question type.

Blank.java: Concrete class implementing the Question interface for creating and managing Blank questions.

Dropdown.java: Concrete class implementing the Question interface for creating and managing Dropdown questions.

MCQ.java: Concrete class implementing the Question interface for creating and managing Multiple Choice Questions (MCQs).

QuestionFactory.java: Factory class responsible for creating instances of different Question types based on the input type.

Main.java: Entry point of the application demonstrating the use of QuestionFactory to create and manage different types of questions.
![image](https://github.com/user-attachments/assets/be2de8cd-f1d2-4fd7-bd0d-10ba54a72d46)


Cloning UserProfile with Prototpe Pattern :-

UserProfile: Abstract base class defining user profile properties and the clone() method for cloning instances.

BasicUserProfile: Concrete implementation of UserProfile for basic profiles, including cloning functionality.

PremiumUserProfile: Concrete UserProfile implementation for premium profiles with additional features and cloning capability.

UserProfileRegistry: Manages and provides cloning of user profile prototypes based on their type.

UserProfileDemo: Demonstrates the usage of UserProfileRegistry for creating, cloning, and modifying user profiles.
![image](https://github.com/user-attachments/assets/0a6bb936-3f30-4caa-93a5-fade09136654)


## STRUCTURAL PATTERNS :

Coffee Shop-Decorator Pattern :-

The Coffee Shop Decorator Pattern project demonstrates the use of the Decorator Design Pattern to dynamically add features to a coffee object. This pattern allows for flexible and extensible modifications to coffee objects without altering their base structure. Users can interactively customize their coffee by adding features such as milk, sugar, whipped cream, chocolate, and vanilla, and see the resulting changes in description and cost.
Coffee: An abstract class that serves as the base type for coffee objects. It defines the core methods getDescription() and cost() that must be implemented by all concrete coffee types.

BasicCoffee: A concrete implementation of the Coffee class representing a standard coffee with a fixed base cost of $5.00. It provides basic functionality without any additional features.

CoffeeDecorator: An abstract class that extends Coffee and serves as the base class for all decorators. It allows for adding extra functionality to the coffee objects by implementing the getDescription() and cost() methods in subclasses.

MilkDecorator: A concrete decorator that adds milk to the coffee. It includes logic for specifying the amount of milk and calculating the additional cost based on the milk quantity.

SugarDecorator: A concrete decorator that adds sugar to the coffee. It includes logic for specifying the amount of sugar and calculating the additional cost based on the sugar quantity.

WhippedCreamDecorator: A concrete decorator that adds whipped cream to the coffee. It modifies the coffee’s description and adds the cost of whipped cream.

ChocolateDecorator: A concrete decorator that adds chocolate to the coffee. It modifies the coffee’s description and adds the cost of chocolate.


App: The main class that serves as the entry point for the application. It provides an interactive menu for users to customize their coffee by adding various features, and then displays the updated coffee description and cost.
![imgonline-com-ua-twotoone-fTFTNKhRxjatU91](https://github.com/user-attachments/assets/ea49260e-25db-4bcc-ae3e-340175f16d91)



MessageService with BuilderPattern

App.java
 Demonstrates the creation and usage of various messaging service instances.
Email.java
 Represents an email message with recipient, subject, and body fields.
Message.java
 Defines methods for setting recipient, subject, and body for messages.
MessagingService.java
 Provides common messaging functionalities for different message types.
SMS.java
 Represents an SMS message with recipient and content fields.
MultimediaMessage.java
 Extends Message to include multimedia content like images or videos.
TextMessage.java
 Represents a basic text message with content management.
WhatsApp.java
 Represents a WhatsApp message with recipient and content fields.
 ![image](https://github.com/user-attachments/assets/ad7b48ec-079a-494a-8657-e1ad1ae74388)




















