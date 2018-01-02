package creational.factory;

public class Rectangle implements Shape {

    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle() {
        this.x = 1;
        this.y = 1;
        this.width = 1;
        this.height = 1;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle!");
    }
}