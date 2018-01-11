package structural.composite;

class Row extends Composite {

    public Row(int value) {
        super(value);
    }

    public void traverse() {
        System.out.print("Row");
        super.traverse();
    }
}
