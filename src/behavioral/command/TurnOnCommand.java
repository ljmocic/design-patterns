package behavioral.command;

public class TurnOnCommand implements Command {

    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public String toString() {
        return "TurnOnCommand";
    }
}
