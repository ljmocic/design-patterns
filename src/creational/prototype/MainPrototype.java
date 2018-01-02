package creational.prototype;

public class MainPrototype {

    public static void main(String[] args) {
        String type = "tom";
        Person prototype = PersonFactory.getPrototype(type);
    }

}
