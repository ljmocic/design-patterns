package creational.factory;

public class ShapeFactory {

    public static Shape getShape(String shapeName) {
        if(shapeName.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        else if(shapeName.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }

}
