package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class View implements Observer {

    private String name;
    private Model model = null;

    public View(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable updatedModel, Object arg) {
        model = (Model) updatedModel;
        System.out.println(model + " updated " + name);
    }
}