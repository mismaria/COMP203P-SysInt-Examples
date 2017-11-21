package third.party;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ThirdPartyFileLogger {

    private final FileOutputStream logFile;

    public ThirdPartyFileLogger(String logfile) {
        try {
            logFile = new FileOutputStream(logfile, true);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void info(LogMessage message) {
        PrintWriter writer = new PrintWriter(logFile);
        writer.println("INFO: " + message);
        writer.flush();
    }

    public void error(LogMessage message) {
        PrintWriter writer = new PrintWriter(logFile);
        writer.println("ERROR: " + message);
        writer.flush();
    }

    public void debug(LogMessage message) {
        PrintWriter writer = new PrintWriter(logFile);
        writer.println("DEBUG: " + message);
        writer.flush();
    }
}
