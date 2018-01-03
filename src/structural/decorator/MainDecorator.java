package structural.decorator;

public class MainDecorator {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        circle.draw();
        redCircle.draw();
    }

}
