package behavioral;

import creational.factory.MainFactory;
import behavioral.observer.MainObserver;

public class MainBehavioral {

    public static void main(String[] args) {

        System.out.println("\nRunning Observer example: ");
        MainObserver.main(null);

        System.out.println("\nRunning Factory example: ");
        MainFactory.main(null);
    }

}
