
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DAO {

    public static final String URL = "jdbc:postgresql://localhost:5432/OD";
    public static final String USUARIO = "postgres";
    public static final String SENHA = "password";

    protected Connection obterConexao() throws Exception {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException ex) {
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
    
    public static void main(String[] args){
        DAO d = new DAO();
        
    }
      
    
}
