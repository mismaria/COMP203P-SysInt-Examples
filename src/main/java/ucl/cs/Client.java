package ucl.cs;

import third.party.ThirdPartyFileLogger;

public class Client {

  private final TimedLogger logger = new TimedLogger(
      new LogFileAdapter(new ThirdPartyFileLogger("file")));

  private void run() {

    logger.log("Starting...");

    // do some things

    logger.log("Stopping.");

  }

  public static void main(String[] args) {
    new Client().run();
  }

}

class SystemOutLogger implements Logger {

  @Override
  public void log(String message) {
    System.out.println(message);
  }
}

