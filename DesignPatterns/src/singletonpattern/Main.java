package singletonpattern;

/**
 * Creational
 */
public class Main {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        System.out.println("Hashcode of instance1 " + instance1.hashCode());
        System.out.println("Hashcode of instance2 " + instance2.hashCode());
        System.out.println("Hashcode of instance3 " + instance3.hashCode());

        // point to the same heap reference
        System.out.println(instance1 == instance2 && instance2 == instance3);
    }
}
