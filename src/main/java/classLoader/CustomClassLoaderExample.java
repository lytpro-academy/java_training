package classLoader;

public class CustomClassLoaderExample {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        CustomClassLoader cl = new CustomClassLoader();
        Class<?> myClass =  cl.loadClass("classLoader.MyClass");
        Object instance = myClass.newInstance();

        if (instance instanceof MyClass) {
            MyClass myClass1 = (MyClass) instance;
            myClass1.sayHello();
        }
    }
}
