package creational.factory;

public class Circle implements Shape {

    private double x;
    private double y;
    private double r;

    public Circle() {
        this.x = 1;
        this.y = 1;
        this.r = 1;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle!");
    }
}
