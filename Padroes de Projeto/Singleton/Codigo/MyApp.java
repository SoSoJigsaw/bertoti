public class MyApp {
    public static void main(String[] args) {
        // obter a instância única da classe DatabaseConfiguration
        DatabaseConfigurationSingleton config = DatabaseConfigurationSingleton.getInstance();

        // usar a configuração do banco de dados
        String url = config.getDatabaseUrl();
        String username = config.getUsername();
        String password = config.getPassword();

        // conectar ao banco de dados usando a configuração
        try {
            Connection conn = DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
