package Educational_Initiatives_Coding.EX1.Structural_Patterns.Messaging_BuilderPattern;
public class SMSService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        // SMS sending logic here
        System.out.println("Sending SMS: " + message);
    }
}

