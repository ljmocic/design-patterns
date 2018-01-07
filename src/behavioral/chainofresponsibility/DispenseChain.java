package behavioral.chainofresponsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain dc);

    void dispense(Currency c);

}
