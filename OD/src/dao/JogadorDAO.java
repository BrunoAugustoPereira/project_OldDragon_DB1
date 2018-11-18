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
    
    public void atualizar(Jogador p) throws Exception {
        
        Connection c = obterConexao();
        String sql = "UPDATE jogador SET nome = ? WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, p.getNome());
        stmt.setInt(2, p.getId());
        
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível atualizar este jogador");
        }
    }

    public void remover(Jogador p) throws Exception {
        Connection c = obterConexao();
        String sql = "DELETE FROM jogador WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, p.getId());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível remover esta jogador");
        }
    }

    public Jogador obter(int codigo) throws Exception {
        Jogador p = null;
        Connection c = obterConexao();
        String sql = "SELECT id, nome FROM jogador WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, codigo);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            p = new Jogador();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (p == null) {
            throw new Exception("Não foi possível localizar este jogador");
        }
        return p;
    }

    public List<Jogador> obterPorNome(String nome) throws Exception {
        if (nome == null || nome.trim().length() == 0) {
            nome = "%";
        } else {
            nome = "%" + nome.toUpperCase() + "%";
        }
        
        List<Jogador> Jogadores = new ArrayList<Jogador>();
        Connection c = obterConexao();
        String sql = "SELECT id, nome FROM jogador WHERE upper(nome) LIKE ? ";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, nome);
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
