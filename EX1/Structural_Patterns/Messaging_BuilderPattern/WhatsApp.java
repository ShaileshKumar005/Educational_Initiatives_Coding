package Educational_Initiatives_Coding.EX1.Structural_Patterns.Messaging_BuilderPattern;
public class WhatsApp extends Message {
    private String recipient;
    private String content;

    public WhatsApp(MessagingService messagingService, String recipient, String content) {
        super(messagingService);
        this.recipient = recipient;
        this.content = content;
    }

    @Override
    public void send() {
        messagingService.sendMessage("WhatsApp to: " + recipient + "\nContent: " + content);
    }
}

