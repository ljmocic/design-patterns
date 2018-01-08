package structural.bridge;

public class MainBridge {

    public static void main(String[] args) {
        TV samsung = new SamsungTV();

        AbstractRemoteControl logitechKeyboard = new LogitechKeyboard(samsung);
        logitechKeyboard.switchChannel(5);

        UniversalRemote universalRemote = new UniversalRemote(samsung);
        universalRemote.press7Button();
    }

}
