import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {

        // get methods of a class at runtime
        House house = new House();
        System.out.println(house.hashCode());
        Method[] methods = house.getClass().getMethods();

        for (Method method : methods) {
            System.out.println("method = " + method.getName());
            if ("method1".equals(method.getName())) {
                method.invoke(house, new String[]{"test"});
            } else if ("method2".equals(method.getName())) {
                method.invoke(house, new String[]{"test", "test2"});
            }
        }

        House houseInstance = (House) Class.forName("House").newInstance();
        System.out.println(houseInstance.hashCode());
        houseInstance.method1("new instance");

        System.out.println(houseInstance.getClass().getSuperclass());

        Method method = Class.forName("House").getDeclaredMethod("method3", null);
        method.setAccessible(true);
        method.invoke(houseInstance, null);

        Field field = House.class.getDeclaredField("field");
        System.out.println(field.getName());
    }
}
