package ucl.cs;

import third.party.LogMessage;
import third.party.ThirdPartyFileLogger;

public class LogFileAdapter implements Logger {

  private final ThirdPartyFileLogger fileLogger;

  public LogFileAdapter(ThirdPartyFileLogger fileLogger) {
    this.fileLogger = fileLogger;
  }

  @Override
  public void log(String message) {
    fileLogger.info(new LogMessage(message));
  }
}
