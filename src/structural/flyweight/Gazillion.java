package structural.flyweight;

public class Gazillion {

    private int row;

    public Gazillion(int row) {
        this.row = row;
    }

    public void report(int col) {
        System.out.println(" " + row + col);
    }
}
