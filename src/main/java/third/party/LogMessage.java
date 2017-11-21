package third.party;

public class LogMessage {

    private final String message;

    public LogMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
