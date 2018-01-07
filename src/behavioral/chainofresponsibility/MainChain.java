package behavioral.chainofresponsibility;

public class MainChain {

    public static void main(String[] args) {
        ATMDispenseChain atm = new ATMDispenseChain();
        atm.dispense(new Currency(180));
    }
}
