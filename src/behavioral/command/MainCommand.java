package behavioral.command;

public class MainCommand {

    public static void main(String[] args) {
        Light light = new Light();

        Command on = new TurnOnCommand(light);
        Command off = new TurnOffCommand(light);
        Command higher = new HigherOpacityCommand(light);
        Command lower = new LowerOpacityCommand(light);

        Switch customSwitch = new Switch();

        customSwitch.storeAndExecute(on);
        customSwitch.storeAndExecute(higher);
        customSwitch.storeAndExecute(lower);
        customSwitch.storeAndExecute(off);
        customSwitch.storeAndExecute(off);
        customSwitch.storeAndExecute(lower);

        System.out.println(customSwitch);
    }
}
