package behavioral.command;

public class TurnOffCommand implements Command {

    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if(light.getOpacity() != 0) {
            light.turnOff();
        }
        else {
            System.out.println("Light already turned off!");
        }
    }

    @Override
    public String toString() {
        return "TurnOffCommand";
    }
}
