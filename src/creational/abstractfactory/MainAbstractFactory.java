package creational.abstractfactory;

import creational.abstractfactory.factories.AbstractGUIFactory;
import creational.abstractfactory.factories.FactoryMaker;
import creational.abstractfactory.interfaces.IButton;
import creational.abstractfactory.interfaces.ILabel;

public class MainAbstractFactory {

    public static void main(String[] args) {
        AbstractGUIFactory factory = FactoryMaker.getFactory("MacOS");

        IButton button = factory.createButton();
        ILabel label = factory.createLabel();

        button.draw();
        label.draw();

        factory = FactoryMaker.getFactory("Windows");

        button = factory.createButton();
        label = factory.createLabel();

        button.draw();
        label.draw();
    }

}
