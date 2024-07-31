package Educational_Initiatives_Coding.EX1.Structural_Patterns.Messaging_BridgePattern;
public class SMS extends Message {
    private String recipient;
    private String content;

    public SMS(MessagingService messagingService, String recipient, String content) {
        super(messagingService);
        this.recipient = recipient;
        this.content = content;
    }

    @Override
    public void send() {
        messagingService.sendMessage("SMS to: " + recipient + "\nContent: " + content);
    }
}
