package creational.abstractfactory.guielements.windows;

import creational.abstractfactory.interfaces.ILabel;

public class WindowsLabel implements ILabel {

    @Override
    public void draw() {
        System.out.println("Windows label drawn!");
    }
}
