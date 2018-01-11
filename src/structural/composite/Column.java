package structural.composite;

class Column extends Composite {

    public Column(int value) {
        super(value);
    }

    public void traverse() {
        System.out.print("Col");
        super.traverse();
    }
}