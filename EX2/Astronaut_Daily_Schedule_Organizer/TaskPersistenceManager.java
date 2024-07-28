package Educational_Initiatives_Coding.EX2.Astronaut_Daily_Schedule_Organizer;
import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TaskPersistenceManager {
    private static final String FILE_NAME = "tasks.txt";

    public void saveTasks(List<Task> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Task task : tasks) {
                writer.write(task.getDescription() + "," +
                             task.getStartTime() + "," +
                             task.getEndTime() + "," +
                             task.getPriority() + "," +
                             task.getStatus());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    public List<Task> loadTasks() {
        List<Task> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    Task task = new Task(parts[0],
                                         LocalTime.parse(parts[1]),
                                         LocalTime.parse(parts[2]),
                                         parts[3]);
                    task.setStatus(parts[4]);
                    tasks.add(task);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
        return tasks;
    }
}
