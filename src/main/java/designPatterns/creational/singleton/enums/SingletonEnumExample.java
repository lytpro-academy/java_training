package designPatterns.creational.singleton.enums;

public class SingletonEnumExample {
    public static void main(String[] args) {
        DatabaseManager.INSTANCE.connect("MyDatabaseConnection");
        DatabaseManager.INSTANCE.executeQuery("SELECT * FROM Users");
        DatabaseManager.INSTANCE.connect("MyDatabaseConnection");
    }
}
