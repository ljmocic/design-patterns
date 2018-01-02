package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {

    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("tom", new Tom());
        prototypes.put("harry", new Harry());
    }

    public static Person getPrototype(String type) {
        return prototypes.get(type).clone();
    }

}
