package OrientacaoObjeto.cap19;

import java.sql.*;

public class ConexaoFactory {
    private final static String urlBd = "jdbc:mysql://localhost:3306/";

    static String user = "root";

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static Connection conectar() throws SQLException {

        connection = DriverManager.getConnection(urlBd);
        System.out.println("Conexão realizada com sucesso!");
        return connection;

    }

    public static void fechar() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
            } catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
}

