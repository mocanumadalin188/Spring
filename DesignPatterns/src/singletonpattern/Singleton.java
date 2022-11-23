package singletonpattern;

public class Singleton {
    private static Singleton instance;
    // could also do eager loading

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        // lazy eval
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
