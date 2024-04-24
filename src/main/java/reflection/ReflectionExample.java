package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {
        Class<?> clas = MyClass.class;

        Field[] fields = clas.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("fieldNames-- "+field.getName());
        }

        Method[] methods = clas.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("methodName-- "+method.getName());
        }

        Constructor<?>[] constructors = clas.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructorName-- "+constructor.getName());
        }
    }
}
