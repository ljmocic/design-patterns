package creational.factory;

public class MainFactory {

    public static void main(String[] args) {
        Shape s = ShapeFactory.getShape("Circle");
        s.draw();

        s = ShapeFactory.getShape("Rectangle");
        s.draw();
    }
}
