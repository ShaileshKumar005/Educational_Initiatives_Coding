package Educational_Initiatives_Coding.EX2.Astronaut_Daily_Schedule_Organizer;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        TaskFactory factory = new TaskFactory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Edit Task");
            System.out.println("5. Mark Task as Completed");
            System.out.println("6. View Tasks by Priority");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    System.out.println("Enter start time (HH:mm):");
                    LocalTime startTime = LocalTime.parse(scanner.nextLine());
                    System.out.println("Enter end time (HH:mm):");
                    LocalTime endTime = LocalTime.parse(scanner.nextLine());
                    System.out.println("Enter priority level (e.g., High, Medium, Low):");
                    String priority = scanner.nextLine();
                    manager.addTask(factory.createTask(description, startTime, endTime, priority));
                    break;

                case 2:
                    System.out.println("Enter task description to remove:");
                    description = scanner.nextLine();
                    manager.removeTask(description);
                    break;

                case 3:
                    manager.viewTasks();
                    break;

                case 4:
                    System.out.println("Enter current task description to edit:");
                    String oldDescription = scanner.nextLine();
                    System.out.println("Enter new task description:");
                    String newDescription = scanner.nextLine();
                    System.out.println("Enter new start time (HH:mm):");
                    startTime = LocalTime.parse(scanner.nextLine());
                    System.out.println("Enter new end time (HH:mm):");
                    endTime = LocalTime.parse(scanner.nextLine());
                    System.out.println("Enter new priority level (e.g., High, Medium, Low):");
                    priority = scanner.nextLine();
                    manager.editTask(oldDescription, newDescription, startTime, endTime, priority);
                    break;

                case 5:
                    System.out.println("Enter task description to mark as completed:");
                    description = scanner.nextLine();
                    manager.markTaskAsCompleted(description);
                    break;

                case 6:
                    System.out.println("Enter priority level to view (e.g., High, Medium, Low):");
                    priority = scanner.nextLine();
                    manager.viewTasksByPriority(priority);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


