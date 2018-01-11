package structural.composite;

public abstract class Composite implements Component {

    private Component[] children;
    private int total;
    private int value;

    public Composite(int value) {
        this.value = value;

        children = new Component[9];
        total = 0;
    }

    public void add(Component c) {
        children[total++] = c;
    }

    public void traverse() {
        System.out.print(value + "  ");
        for (int i=0; i < total; i++) {
            children[i].traverse();
        }
    }
}
