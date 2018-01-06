package behavioral.command;

public class LowerOpacityCommand implements Command {

    private Light light;

    public LowerOpacityCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lowerOpacity();
    }

    @Override
    public String toString() {
        return "LowerOpacityCommand";
    }
}
