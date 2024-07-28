package Educational_Initiatives_Coding.EX2.Astronaut_Daily_Schedule_Organizer;
import java.time.LocalTime;

public class TaskFactory {
    public Task createTask(String description, LocalTime startTime, LocalTime endTime, String priority) {
        return new Task(description, startTime, endTime, priority);
    }
}



