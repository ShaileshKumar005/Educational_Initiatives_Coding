package Educational_Initiatives_Coding.EX1.Structural_Patterns.Messaging_BuilderPattern;

public class EmailService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        // Email sending logic here
        System.out.println("Sending Email: " + message);
    }
}
