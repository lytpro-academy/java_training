package designPatterns.creational.singleton.enums;

public enum DatabaseManager {
    INSTANCE;

    // assume we're using this class to connect to a database
    // we'll simulate the database connection with a simple string
    private String connection;

    public void connect(String connectionStr) {
        connection = connectionStr;
        System.out.println("Connected to database: " + connection);
    }

    public void executeQuery(String query) {
        if (connection != null) {
            System.out.println("Executing query: " + query + ", on database: " + connection);
        } else {
            System.out.println("No connection established.");
        }
    }
}
