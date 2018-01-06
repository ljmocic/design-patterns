package behavioral.command;

public class HigherOpacityCommand implements Command {

    private Light light;

    public HigherOpacityCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.higherOpacity();
    }

    @Override
    public String toString() {
        return "HigherOpacityCommand";
    }
}
