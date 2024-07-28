package Educational_Initiatives_Coding.EX2.Astronaut_Daily_Schedule_Organizer;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Task> tasks;

    public User(String username) {
        this.username = username;
        this.tasks = new ArrayList<>();
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public List<Task> getTasks() { return tasks; }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(String description) {
        tasks.removeIf(task -> task.getDescription().equalsIgnoreCase(description));
    }

    public Task findTaskByDescription(String description) {
        return tasks.stream()
                    .filter(task -> task.getDescription().equalsIgnoreCase(description))
                    .findFirst()
                    .orElse(null);
    }

    @Override
    public String toString() {
        return "User: " + username + "\nTasks: " + tasks;
    }
}

