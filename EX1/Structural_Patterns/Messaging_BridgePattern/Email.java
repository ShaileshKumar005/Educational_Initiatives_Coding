package Educational_Initiatives_Coding.EX1.Structural_Patterns.Messaging_BridgePattern;
public class Email extends Message {
    private String recipient;
    private String subject;
    private String body;

    public Email(MessagingService messagingService, String recipient, String subject, String body) {
        super(messagingService);
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public void send() {
        messagingService.sendMessage("Email to: " + recipient + "\nSubject: " + subject + "\nBody: " + body);
    }
}

