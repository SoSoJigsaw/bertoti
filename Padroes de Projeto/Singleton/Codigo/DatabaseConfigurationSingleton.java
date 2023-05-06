public class DatabaseConfigurationSingleton {
    private static DatabaseConfigurationSingleton instance;
    private String databaseUrl;
    private String username;
    private String password;

    private DatabaseConfigurationSingleton() {
        databaseUrl = "jdbc:mysql://localhost:3306/mydb";
        username = "root";
        password = "mypassword";
    }

    public static synchronized DatabaseConfigurationSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseConfigurationSingleton();
        }

        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}