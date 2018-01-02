package creational.abstractfactory.factories;

import creational.abstractfactory.interfaces.IButton;
import creational.abstractfactory.interfaces.ILabel;
import creational.abstractfactory.guielements.windows.WindowsButton;
import creational.abstractfactory.guielements.windows.WindowsLabel;

public class WindowsFactory extends AbstractGUIFactory {

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ILabel createLabel() {
        return new WindowsLabel();
    }

}
