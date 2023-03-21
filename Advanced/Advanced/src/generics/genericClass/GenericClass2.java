package generics.genericClass;

import java.util.Collection;

public class GenericClass2 implements GenericInterface<String> {

    @Override
    public void printCollection(Collection<String> collection) {
        System.out.println("printing strings");
    }
}
