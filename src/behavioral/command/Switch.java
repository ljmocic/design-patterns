package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Switch {

    private List<Command> history = new ArrayList<>();

    public void storeAndExecute(Command command) {
        history.add(command);
        command.execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nHistory: \n");
        for(Command c:history) {
            sb.append(c);
            sb.append("\n");
        }
        return sb.toString();
    }

}
