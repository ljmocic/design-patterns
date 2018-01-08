package structural.bridge;

public abstract class AbstractRemoteControl {

    private TV tv;

    public AbstractRemoteControl(TV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.on();
    }

    public void turnOf() {
        tv.off();
    }

    public void switchChannel(int channel) {
        tv.switchChannel(channel);
    }
}
