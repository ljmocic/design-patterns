package creational.abstractfactory.factories;

import creational.abstractfactory.interfaces.IButton;
import creational.abstractfactory.interfaces.ILabel;
import creational.abstractfactory.guielements.macos.MacOSButton;
import creational.abstractfactory.guielements.macos.MacOSLabel;

public class MacOSFactory extends AbstractGUIFactory {

    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public ILabel createLabel() {
        return new MacOSLabel();
    }

}
