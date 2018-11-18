/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class JogadorDAO extends DAO{
    public void inserir(Jogador j) throws Exception {
        Connection c = obterConexao();
        String sql = "INSERT INTO public.jogador(nome) VALUES (?);";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1,j.getNome());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir esta pessoa");
        }      
    }
    
    public List<Jogador> obterTodos() throws Exception {
        List<Jogador> Jogadores = new ArrayList<Jogador>();
        Connection c = obterConexao();
        String sql = "SELECT id, nome FROM jogador";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Jogador p = new Jogador();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            Jogadores.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Jogadores;
    }

   
}
