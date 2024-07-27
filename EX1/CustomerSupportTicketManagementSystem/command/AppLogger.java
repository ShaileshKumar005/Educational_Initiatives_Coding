package Educational_Initiatives_Coding.EX1.CustomerSupportTicketManagementSystem.command;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppLogger {
    private static final Logger logger = Logger.getLogger(AppLogger.class.getName());

    // Logs an info message
    public static void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    // Logs a warning message
    public static void logWarning(String message) {
        logger.log(Level.WARNING, message);
    }

    // Logs a severe message with an exception
    public static void logSevere(String message, Exception e) {
        logger.log(Level.SEVERE, message, e);
    }
}
