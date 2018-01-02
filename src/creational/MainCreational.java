package creational;

import creational.abstractfactory.MainAbstractFactory;
import creational.builder.MainBuilder;
import creational.factory.MainFactory;
import creational.prototype.MainPrototype;
import creational.singleton.MainSingleton;

public class MainCreational {

    public static void main(String[] args) {
        System.out.println("\nRunning Abstract factory example: ");
        MainAbstractFactory.main(null);

        System.out.println("\nRunning Builder example: ");
        MainBuilder.main(null);

        System.out.println("\nRunning Factory example: ");
        MainFactory.main(null);

        System.out.println("\nRunning Prototype example: ");
        MainPrototype.main(null);

        System.out.println("\nRunning Singleton example: ");
        MainSingleton.main(null);
    }
}
