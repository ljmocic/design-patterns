package creational.abstractfactory.guielements.macos;

import creational.abstractfactory.interfaces.IButton;

public class MacOSButton implements IButton {

    @Override
    public void draw() {
        System.out.println("MacOS button drawn!");
    }

}
