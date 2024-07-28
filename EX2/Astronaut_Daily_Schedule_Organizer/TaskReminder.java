package Educational_Initiatives_Coding.EX2.Astronaut_Daily_Schedule_Organizer;
import java.time.LocalTime;
import java.util.List;

public class TaskReminder {
    public void sendReminders(List<Task> tasks) {
        LocalTime now = LocalTime.now();
        for (Task task : tasks) {
            if (task.getStartTime().isAfter(now) && task.getStartTime().minusMinutes(30).isBefore(now)) {
                System.out.println("Reminder: Task \"" + task.getDescription() + "\" starts at " + task.getStartTime());
            }
        }
    }
}

