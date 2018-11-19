/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Leonardo Oliveira Moreira
 *
 * Classe que encapsula a obtenção e fechamento de conexões com o banco de dados
 */
public class DAO {

    public static final String JDBC_URL = "jdbc:postgresql://localhost:5432/OD";
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
