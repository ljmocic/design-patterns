package creational.abstractfactory.factories;

import creational.abstractfactory.interfaces.IButton;
import creational.abstractfactory.interfaces.ILabel;

public abstract class AbstractGUIFactory {

    public abstract IButton createButton();

    public abstract ILabel createLabel();

}
