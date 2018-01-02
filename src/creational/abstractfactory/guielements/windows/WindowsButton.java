package creational.abstractfactory.guielements.windows;

import creational.abstractfactory.interfaces.IButton;

public class WindowsButton implements IButton {

    @Override
    public void draw() {
        System.out.println("Windows button drawn!");
    }

}
