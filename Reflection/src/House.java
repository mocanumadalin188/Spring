public class House extends HouseParent {

    protected String fieldOfChoice;
    public void method1(String str) {
        System.out.println(str);
    }

    public void method2(String str, String str2) {
        System.out.println(str + str2);
    }

    private void method3() {
        System.out.println("Could access private method from outside");
    }
}
