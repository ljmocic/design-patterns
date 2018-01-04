package structural.facade;

public class MainFacade {

    public static void main(String[] args) {
        ComputerFacade cf = new ComputerFacade();
        cf.turnOn();
        System.out.println("Working on computer!");
        System.out.println("Working done!");
        cf.turnOff();
    }

}
