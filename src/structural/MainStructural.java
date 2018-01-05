package structural;

import structural.adapter.MainAdapter;
import structural.decorator.MainDecorator;
import structural.facade.MainFacade;

public class MainStructural {

    public static void main(String[] args) {
        System.out.println("\nRunning Decorator example: ");
        MainDecorator.main(null);

        System.out.println("\nRunning Facade example: ");
        MainFacade.main(null);

        System.out.println("\nRunning Adapter example: ");
        MainAdapter.main(null);
    }

}
