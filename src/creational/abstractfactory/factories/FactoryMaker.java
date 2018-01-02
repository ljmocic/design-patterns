package creational.abstractfactory.factories;

public class FactoryMaker {

    private static AbstractGUIFactory factory;

    public static AbstractGUIFactory getFactory(String factoryName){

        if(factoryName.equalsIgnoreCase("Windows")) {
            System.out.println("Windows factory created!");
            factory = new WindowsFactory();
        }
        else if(factoryName.equalsIgnoreCase("MacOS")) {
            System.out.println("MacOS factory created!");
            factory =  new MacOSFactory();
        }

        return factory;
    }

}
