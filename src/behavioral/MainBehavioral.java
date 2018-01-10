package behavioral;

import behavioral.chainofresponsibility.MainChain;
import behavioral.command.MainCommand;
import behavioral.observer.MainObserver;

public class MainBehavioral {

    public static void main(String[] args) {

        System.out.println("\nRunning Observer example: ");
        MainObserver.main(null);

        System.out.println("\nRunning Command example: ");
        MainCommand.main(null);

        System.out.println("\nRunning Chain of responsibility example: ");
        MainChain.main(null);

        System.out.println("\nRunning Iterator example: ");
        MainChain.main(null);

    }

}
