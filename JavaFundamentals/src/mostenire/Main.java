package mostenire;

public class Main {
    public static void main(String[] args) {
        Caine c = new Caine();
        c.mananca();
        Animal a = new Animal();

        Integer i = 12;

        System.out.println(a instanceof Animal);
        System.out.println(c instanceof Animal);

        System.out.println(i instanceof Number);
    }
}
