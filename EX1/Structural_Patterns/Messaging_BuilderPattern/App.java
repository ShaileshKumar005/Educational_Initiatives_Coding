package Educational_Initiatives_Coding.EX1.Structural_Patterns.Messaging_BuilderPattern;
public class App {
    public static void main(String[] args) {
        MessagingService emailService = new EmailService();
        MessagingService smsService = new SMSService();
        MessagingService whatsappService = new WhatsAppService();

        Message email = new Email(emailService, "test@example.com", "Subject", "Body");
        Message sms = new SMS(smsService, "1234567890", "Hello SMS");
        Message whatsapp = new WhatsApp(whatsappService, "9876543210", "Hello WhatsApp");

        email.send();
        sms.send();
        whatsapp.send();
    }
}
