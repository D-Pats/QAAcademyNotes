package Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingTest {
	
	public static Logger LOGGER = LogManager.getLogger();

	public void logMessage(String message) {
	    LOGGER.info(message);
	}
	
	
}
