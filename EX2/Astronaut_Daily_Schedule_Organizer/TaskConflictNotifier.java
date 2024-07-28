package Educational_Initiatives_Coding.EX2.Astronaut_Daily_Schedule_Organizer;

public class TaskConflictNotifier implements Observer {
    
    public void update(String message) {
        System.out.println("Notification: " + message);
    }
}
