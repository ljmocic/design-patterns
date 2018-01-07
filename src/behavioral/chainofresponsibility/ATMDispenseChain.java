package behavioral.chainofresponsibility;

public class ATMDispenseChain {

    private DispenseChain dc50;

    public ATMDispenseChain() {
        this.dc50 = new Dollar50Dispenser();
        DispenseChain dc20 = new Dollar20Dispenser();
        DispenseChain dc10 = new Dollar10Dispenser();

        dc50.setNextChain(dc20);
        dc20.setNextChain(dc10);
    }

    public void dispense(Currency currency) {
        dc50.dispense(currency);
    }
}
