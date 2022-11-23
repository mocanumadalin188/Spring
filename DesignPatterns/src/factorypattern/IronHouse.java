package factorypattern;

public class IronHouse implements House {
    @Override
    public void build() {
        System.out.println("Building the iron house");
    }
}
