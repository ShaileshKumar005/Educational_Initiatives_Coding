package Educational_Initiatives_Coding.EX1.Structural_Patterns.Messaging_BuilderPattern;



public abstract class Message {
    protected MessagingService messagingService;

    public Message(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    public abstract void send(String message, String recipient);
}