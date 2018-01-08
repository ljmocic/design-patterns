package structural.bridge;

public class LogitechKeyboard extends AbstractRemoteControl{

    public LogitechKeyboard(TV tv) {
        super(tv);
    }

    public void typeChannel(int channel) {
        switchChannel(channel);
    }
}
