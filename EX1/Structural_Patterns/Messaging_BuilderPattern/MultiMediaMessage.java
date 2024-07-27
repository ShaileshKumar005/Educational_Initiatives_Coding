package Educational_Initiatives_Coding.EX1.Structural_Patterns.Messaging_BuilderPattern;

public class MultiMediaMessage extends  Message{

    public MultiMediaMessage(MessagingService messagingService) {
        super(messagingService);
    }
    @Override
    public void send(String message, String recipient) {
        messagingService.sendMessage("Multimedia: " + message, recipient);
    }
}