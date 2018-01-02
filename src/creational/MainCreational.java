package creational;

import creational.builder.MainBuilder;
import creational.singleton.MainSingleton;

public class MainCreational {

    public static void main(String[] args) {
        System.out.println("\nRunning Builder example: ");
        MainBuilder.main(null);

        System.out.println("\nRunning Singleton example: ");
        MainSingleton.main(null);
    }
}
