package creational.singleton;

public final class GlobalVar {

    private static final GlobalVar INSTANCE = new GlobalVar();

    private GlobalVar() {

    }

    public static GlobalVar getInstance() {
        return INSTANCE;
    }
}
