/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author aluno
 */
public class ClasseDAO extends DAO {
     public void inserir(Classe a) throws Exception {
        Connection c = obterConexao();
        String sql = "INSERT INTO public.classe(nome,dado_de_vida) VALUES (?, ?);";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1,a.getNome());
        stmt.setString(2,a.getDado_de_vida());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir esta pessoa");
        }
            
           
    }
}
