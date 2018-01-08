package structural.bridge;

public class UniversalRemote extends AbstractRemoteControl {

    public UniversalRemote(TV tv) {
        super(tv);
    }

    public void press7Button() {
        switchChannel(7);
    }
}
