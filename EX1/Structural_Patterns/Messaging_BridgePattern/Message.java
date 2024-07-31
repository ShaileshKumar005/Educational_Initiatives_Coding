package Educational_Initiatives_Coding.EX1.Structural_Patterns.Messaging_BridgePattern;
public abstract class Message {
    protected MessagingService messagingService;

    protected Message(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    public abstract void send();
}



