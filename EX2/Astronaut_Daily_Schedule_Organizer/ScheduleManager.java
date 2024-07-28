package Educational_Initiatives_Coding.EX2.Astronaut_Daily_Schedule_Organizer;
import java.time.LocalTime;
//import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private TaskConflictNotifier taskConflictNotifier;
    private TaskLogger taskLogger = new TaskLogger();
    private TaskPersistenceManager persistenceManager = new TaskPersistenceManager();

    private ScheduleManager() {
        tasks = persistenceManager.loadTasks();
        taskConflictNotifier = new TaskConflictNotifier();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

   
    public void addTask(Task task) {
        if (validateTask(task)) {
            tasks.add(task);
            taskLogger.log("Added task: " + task);
            System.out.println("Task added successfully. No conflicts.");
            saveTasks();
        } else {
            System.out.println("Error: Task conflicts with existing tasks.");
        }
    }

  
    public void removeTask(String description) {
        Task taskToRemove = findTaskByDescription(description);
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            taskLogger.log("Removed task: " + taskToRemove);
            System.out.println("Task removed successfully.");
            saveTasks();
        } else {
            System.out.println("Error: Task not found.");
        }
    }

   
    public void viewTasks() {
        tasks.sort(Comparator.comparing(Task::getStartTime));
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    
    public void editTask(String oldDescription, String newDescription, LocalTime newStartTime, LocalTime newEndTime, String newPriority) {
        Task taskToEdit = findTaskByDescription(oldDescription);
        if (taskToEdit != null) {
            Task newTask = new Task(newDescription, newStartTime, newEndTime, newPriority);
            if (validateTask(newTask)) {
                taskToEdit.setDescription(newDescription);
                taskToEdit.setStartTime(newStartTime);
                taskToEdit.setEndTime(newEndTime);
                taskToEdit.setPriority(newPriority);
                taskLogger.log("Edited task: " + taskToEdit);
                System.out.println("Task updated successfully.");
                saveTasks();
            } else {
                System.out.println("Error: Task conflicts with existing tasks.");
            }
        } else {
            System.out.println("Error: Task not found.");
        }
    }

 
    public void markTaskAsCompleted(String description) {
        Task task = findTaskByDescription(description);
        if (task != null) {
            task.setStatus("Completed");
            taskLogger.log("Marked task as completed: " + task);
            System.out.println("Task marked as completed.");
            saveTasks();
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    public void viewTasksByPriority(String priority) {
        List<Task> filteredTasks = tasks.stream()
                                        .filter(task -> task.getPriority().equalsIgnoreCase(priority))
                                        .sorted(Comparator.comparing(Task::getStartTime))
                                        .toList();
        if (filteredTasks.isEmpty()) {
            System.out.println("No tasks found with priority level: " + priority);
        } else {
            for (Task task : filteredTasks) {
                System.out.println(task);
            }
        }
    }

    private boolean validateTask(Task newTask) {
        for (Task existingTask : tasks) {
            if (taskConflicts(newTask, existingTask)) {
                taskConflictNotifier.update("Task conflicts with existing task \"" + existingTask.getDescription() + "\".");
                return false;
            }
        }
        return true;
    }

    private boolean taskConflicts(Task task1, Task task2) {
        return task1.getStartTime().isBefore(task2.getEndTime()) && task1.getEndTime().isAfter(task2.getStartTime());
    }

    private Task findTaskByDescription(String description) {
        return tasks.stream()
                    .filter(task -> task.getDescription().equalsIgnoreCase(description))
                    .findFirst()
                    .orElse(null);
    }

    private void saveTasks() {
        persistenceManager.saveTasks(tasks);
    }
}
