package creational.prototype;

public class Tom implements Person {

    private final String NAME = "Tom";

    @Override
    public Person clone() {
        System.out.println("Harry cloned!");
        return new Tom();
    }

    @Override
    public String toString() {
        return NAME;
    }

}
