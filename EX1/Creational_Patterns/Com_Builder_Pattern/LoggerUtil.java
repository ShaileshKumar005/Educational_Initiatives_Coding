package Educational_Initiatives_Coding.EX1.Creational_Patterns.Com_Builder_Pattern;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUtil {
    private static final Logger logger = Logger.getLogger(LoggerUtil.class.getName());

    public static void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    public static void logWarning(String message) {
        logger.log(Level.WARNING, message);
    }

    public static void logError(String message, Throwable thrown) {
        logger.log(Level.SEVERE, message, thrown);
    }
}
