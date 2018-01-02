package creational.singleton;

import creational.builder.MainBuilder;

public class MainSingleton {

    public static void main(String[] args) {
        GlobalVar var = GlobalVar.getInstance();
        System.out.println("Now you have access to global variable.");
    }
}
