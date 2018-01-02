package creational.abstractfactory.guielements.macos;

import creational.abstractfactory.interfaces.ILabel;

public class MacOSLabel implements ILabel {

    @Override
    public void draw() {
        System.out.println("MacOS Label drawn!");
    }
}
