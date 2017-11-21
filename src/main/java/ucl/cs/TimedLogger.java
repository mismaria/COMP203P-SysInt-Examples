package ucl.cs;

import java.time.LocalTime;

public class TimedLogger implements Logger {

  private final Logger downstream;

  public TimedLogger(Logger downstream) {
    this.downstream = downstream;
  }

  @Override
  public void log(String message) {
    downstream.log(LocalTime.now().toString() + " : " + message);
  }
}
