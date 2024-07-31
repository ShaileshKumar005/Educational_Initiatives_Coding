package Educational_Initiatives_Coding.EX1.Structural_Patterns.Messaging_BuilderPattern;

public class WhatsAppService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        // WhatsApp sending logic here
        System.out.println("Sending WhatsApp: " + message);
    }
}

