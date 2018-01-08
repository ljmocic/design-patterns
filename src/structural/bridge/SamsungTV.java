package structural.bridge;

public class SamsungTV implements TV {

    @Override
    public void on() {
        System.out.println("Samsung TV is ON");
    }

    @Override
    public void off() {
        System.out.println("Samsung TV is OFF");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Samsung TV switched to channel " + channel);
    }
}
