# Educational_Initiatives_Coding

# EX 1

# BEHAVIOURAL PATTERNS :


### Customer Support Ticket Management
The Customer Support Ticket Management system uses the Observer pattern to notify relevant parties about ticket updates and the Chain of Responsibility pattern to route tickets through various handlers based on their type or severity. This design enables real-time updates and flexible ticket processing.

### Home Automation - Light Use Case
The Home Automation - Light Use Case leverages the Command pattern to encapsulate light control operations as commands and the Strategy pattern to manage different light control algorithms based on user preferences or environmental conditions. This setup provides flexible and dynamic lighting management.


# CREATIONAL PATTERNS :

### Question creator with Factory Pattern :-

The primary goal is to provide a flexible and extensible framework for adding new question types without modifying the existing codebase.
Question.java: Interface defining methods for adding questions, answers, and marks for any question type.

Blank.java: Concrete class implementing the Question interface for creating and managing Blank questions.

Dropdown.java: Concrete class implementing the Question interface for creating and managing Dropdown questions.

MCQ.java: Concrete class implementing the Question interface for creating and managing Multiple Choice Questions (MCQs).

QuestionFactory.java: Factory class responsible for creating instances of different Question types based on the input type.

Main.java: Entry point of the application demonstrating the use of QuestionFactory to create and manage different types of questions.



### Cloning UserProfile with Prototpe Pattern :-

UserProfile: Abstract base class defining user profile properties and the clone() method for cloning instances.

BasicUserProfile: Concrete implementation of UserProfile for basic profiles, including cloning functionality.

PremiumUserProfile: Concrete UserProfile implementation for premium profiles with additional features and cloning capability.

UserProfileRegistry: Manages and provides cloning of user profile prototypes based on their type.

UserProfileDemo: Demonstrates the usage of UserProfileRegistry for creating, cloning, and modifying user profiles.



# STRUCTURAL PATTERNS :

### Coffee Shop-Decorator Pattern :-

The Coffee Shop Decorator Pattern project demonstrates the use of the Decorator Design Pattern to dynamically add features to a coffee object. This pattern allows for flexible and extensible modifications to coffee objects without altering their base structure. Users can interactively customize their coffee by adding features such as milk, sugar, whipped cream, chocolate, and vanilla, and see the resulting changes in description and cost.

Coffee: An abstract class that serves as the base type for coffee objects. It defines the core methods getDescription() and cost() that must be implemented by all concrete coffee types.

BasicCoffee: A concrete implementation of the Coffee class representing a standard coffee with a fixed base cost of $5.00. It provides basic functionality without any additional features.

CoffeeDecorator: An abstract class that extends Coffee and serves as the base class for all decorators. It allows for adding extra functionality to the coffee objects by implementing the getDescription() and cost() methods in subclasses.

MilkDecorator: A concrete decorator that adds milk to the coffee. It includes logic for specifying the amount of milk and calculating the additional cost based on the milk quantity.

SugarDecorator: A concrete decorator that adds sugar to the coffee. It includes logic for specifying the amount of sugar and calculating the additional cost based on the sugar quantity.

WhippedCreamDecorator: A concrete decorator that adds whipped cream to the coffee. It modifies the coffee’s description and adds the cost of whipped cream.

ChocolateDecorator: A concrete decorator that adds chocolate to the coffee. It modifies the coffee’s description and adds the cost of chocolate.


App: The main class that serves as the entry point for the application. It provides an interactive menu for users to customize their coffee by adding various features, and then displays the updated coffee description and cost.


### MessageService with BridgerPattern


The **Message Service** project implements the **Bridge Pattern**, a structural design pattern that separates an abstraction from its implementation. This separation allows both the abstraction and its implementation to evolve independently. The Bridge Pattern is particularly effective for managing complexity when both the abstractions and their implementations need to vary.

## Key Components

### Abstraction

- **`Message.java`**:
  - Acts as the abstraction layer in the Bridge Pattern.
  - Holds a reference to a `MessagingService` object.
  - Defines high-level operations for sending messages and delegates the actual sending to the `MessagingService` instance.

### Refined Abstractions

- **`Email.java`**, **`SMS.java`**, **`WhatsApp.java`**:
  - Concrete subclasses of `Message`.
  - Represent different types of messages (Email, SMS, WhatsApp).
  - Use the `MessagingService` to handle the specifics of message sending.

### Implementor

- **`MessagingService.java`**:
  - An interface that declares the `sendMessage(String message)` method.
  - Defines the contract for sending messages.

### Concrete Implementors

- **`EmailService.java`**, **`SMSService.java`**, **`WhatsAppService.java`**:
  - Implement the `MessagingService` interface.
  - Each class provides specific logic for sending messages through different channels (Email, SMS, WhatsApp).


### Abstraction and Implementation

- **Message Class**:
  The `Message` class defines the message structure and delegates sending functionality to the `MessagingService`. This separation allows for independent changes to the message types and the methods of sending them.

### Separation of Concerns

- **Decoupling**:
  By decoupling message construction (abstraction) from message sending (implementation), the Bridge Pattern facilitates the independent evolution of both components. This design makes it easier to adapt and extend the system without affecting other parts of the codebase.

 
 # MINI PROJECT
 # Astronaut Daily Schedule Organizer

## Project Overview
The Astronaut Daily Schedule Organizer is a console-based application designed to manage astronauts' daily routines during space missions. It ensures that astronauts adhere to essential activities such as exercise, meals, breaks, and sleep by enforcing specific rules and priorities. This project aims to optimize astronauts' health and productivity by efficiently scheduling and managing their tasks.

## Functional Requirements
### Mandatory
- **Add Task**: Add a new task with description, start time, end time, and priority level.
- **Remove Task**: Remove an existing task from the schedule.
- **View Tasks**: Display all tasks sorted by start time.
- **Validate Task Overlaps**: Ensure new tasks do not overlap with existing tasks.
- **Error Handling**: Provide appropriate error messages for invalid operations.

### Optional
- **Edit Task**: Modify the details of an existing task.
- **Mark Task as Completed**: Mark tasks as completed once finished.
- **View Tasks by Priority**: View tasks filtered by priority level.

## Non-Functional Requirements
- **Graceful Exception Handling**: Ensure the application handles exceptions smoothly.
- **Performance Optimization**: Optimize the application for efficient performance.
- **Logging Mechanism**: Implement a logging system to track application usage and errors.

## Design Patterns
- **Singleton Pattern**:
  - **ScheduleManager**: Ensures a single instance manages all tasks and scheduling.
- **Factory Pattern**:
  - **TaskFactory**: Creates new task objects based on provided details.
- **Observer Pattern**:
  - **TaskConflictNotifier**: Notifies users of any conflicts with newly added tasks.

## Components
- **Task**: Manages task details including description, start time, end time, priority, and status.
- **TaskValidator**: Validates task inputs to ensure they are correct and do not conflict.
- **TaskFactory**: Creates new task instances.
- **ScheduleManager**: Manages overall scheduling logic, including task addition, removal, viewing, and conflict management.
- **SleepSchedule**: Validates tasks against the sleep period (9:30 PM to 6:00 AM).
- **FoodSchedule**: Ensures meals are scheduled and prevents missed meals.
- **MedicalCheckupScheduler**: Ensures medical checkups are scheduled between 10:00 AM and 11:00 AM.
- **NotificationManager**: Provides reminders for upcoming tasks.
- **TaskDependencyManager**: Manages dependencies between tasks.
- **FileManager**: Handles saving and retrieving tasks to and from a file.

## Usage
- **Adding Tasks**: Use the `addTask` method in `ScheduleManager`. Validations ensure only valid tasks are added.
- **Removing Tasks**: Remove tasks by description.
- **Viewing Tasks**: View the current schedule of tasks.
- **Completing Tasks**: Confirm task completion.
- **Generating Reports**: Produce a daily report on completed tasks, exercise time, breaks, and alerts for missed meals or insufficient exercise.

## Notable Considerations
- Tasks cannot be scheduled during the sleep period (9:30 PM to 6:00 AM).
- Medical checkups are only allowed between 10:00 AM and 11:00 AM.
- Conflicting tasks require resolution or rescheduling based on priorities and user input.
- Warnings are provided for missed meals, insufficient exercise, and missed breaks.

## Conclusion
The Astronaut Daily Schedule Organizer project demonstrates various design patterns and best practices to efficiently manage astronauts' schedules. By adhering to SOLID principles and employing design patterns, the application ensures that astronauts maintain a balanced and productive routine during their missions. This project aims to enhance astronauts' well-being and operational efficiency through effective scheduling and task management.






















