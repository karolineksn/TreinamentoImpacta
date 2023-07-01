package OrientacaoObjeto.cap19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteFactory {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConexaoFactory.conectar();
        Statement statement = connection.createStatement();

        String query = "SELECT * FROM IMPACTA.teste;";
        ResultSet response = statement.executeQuery(query);

        while (response.next()){
            response.getString("ID"); //exemplo de busca pelo nome da coluna
            response.getString(1);    //exemplo de busca por index, ou vc pode ser mais
        }                                        //específico e informar lá na query os campos que quer

    }
}
