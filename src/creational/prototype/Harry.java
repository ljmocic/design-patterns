package creational.prototype;

class Harry implements Person {

    private final String NAME = "Harry";

    @Override
    public Person clone() {
        System.out.println("Harry cloned!");
        return new Harry();
    }

    @Override
    public String toString() {
        return NAME;
    }

}
