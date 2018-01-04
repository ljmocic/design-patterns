package structural.facade;

public class ComputerFacade {

    private CPU cpu;
    private RAM ram;
    private HDD hdd;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public void turnOn() {
        System.out.println("Sumulating turning ON...");
        cpu.execute();
        ram.load();
        hdd.write();
        System.out.println("Turned on!");
    }

    public void turnOff() {
        System.out.println("Sumulating turning OFF...");
        cpu.freeze();
        hdd.write();
        System.out.println("Turned off!");
    }

}
