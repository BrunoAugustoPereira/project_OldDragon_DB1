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
public class IdiomaDAO extends DAO{
    public void inserir(Idioma j) throws Exception {
        Connection c = obterConexao();
        String sql = "INSERT INTO public.idioma(nome) VALUES (?);";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1,j.getNome());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir este Idioma");
        }      
    }
    
    public List<Idioma> obterTodos() throws Exception {
        List<Idioma> Idiomas = new ArrayList<Idioma>();
        Connection c = obterConexao();
        String sql = "SELECT id, nome FROM idioma";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Idioma p = new Idioma();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            Idiomas.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Idiomas;
    }
    
    public void atualizar(Idioma p) throws Exception {
        
        Connection c = obterConexao();
        String sql = "UPDATE idioma SET nome = ? WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, p.getNome());
        stmt.setInt(2, p.getId());
        
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível atualizar este Idioma");
        }
    }

    public void remover(Idioma p) throws Exception {
        Connection c = obterConexao();
        String sql = "DELETE FROM idioma WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, p.getId());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível remover esta Idioma");
        }
    }

    public Idioma obter(int codigo) throws Exception {
        Idioma p = null;
        Connection c = obterConexao();
        String sql = "SELECT id, nome FROM idioma WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, codigo);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            p = new Idioma();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (p == null) {
            throw new Exception("Não foi possível localizar este Idioma");
        }
        return p;
    }

    public List<Idioma> obterPorNome(String nome) throws Exception {
        if (nome == null || nome.trim().length() == 0) {
            nome = "%";
        } else {
            nome = "%" + nome.toUpperCase() + "%";
        }
        
        List<Idioma> Idiomas = new ArrayList<Idioma>();
        Connection c = obterConexao();
        String sql = "SELECT id, nome FROM idioma WHERE upper(nome) LIKE ? ";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Idioma p = new Idioma();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            Idiomas.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Idiomas;
    }

   
}
