package structural.bridge;

public class SonyTV implements TV {

    @Override
    public void on() {
        System.out.println("Sony TV is ON");
    }

    @Override
    public void off() {
        System.out.println("Sony TV is OFF");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Sony TV switched to channel " + channel);
    }
}
