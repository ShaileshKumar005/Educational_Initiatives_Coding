package Educational_Initiatives_Coding.EX1.Structural_Patterns.Messaging_BuilderPattern;

public class WhatsApp implements MessagingService{
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending Whatsapp message to " + recipient + ": " + message);
    }
}