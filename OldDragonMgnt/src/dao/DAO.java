
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DAO {

    public static final String JDBC_URL = "jdbc:postgresql://localhost:5432/cadastro";
    public static final String JDBC_USUARIO = "postgres";
    public static final String JDBC_SENHA = "ufc123";

    protected Connection obterConexao() throws Exception {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
        } catch (ClassNotFoundException ex) {
            throw new Exception(ex);
        } catch (SQLException ex) {
            throw new Exception(ex);
        }
        return c;
    }

    protected void fecharConexao(Connection c) throws Exception {
        try {
            if (c != null && !c.isClosed()) {
                c.close();
            }
        } catch (SQLException ex) {
            throw new Exception(ex);
        }
    }
}
