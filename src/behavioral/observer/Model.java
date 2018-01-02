package behavioral.observer;

import java.util.Observable;

public class Model extends Observable {

    private String string;

    public Model(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return string;
    }
}