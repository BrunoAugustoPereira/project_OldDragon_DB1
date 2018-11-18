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
public class MestreDAO extends DAO {
   public void inserir(Mestre m) throws Exception {
        Connection c = obterConexao();
        String sql = "INSERT INTO public.mestre(nome) VALUES (?);";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1,m.getNome());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir este Mestre");
        }    
    }
   
    
    public List<Mestre> obterTodos() throws Exception {
        List<Mestre> Mestres = new ArrayList<Mestre>();
        Connection c = obterConexao();
        String sql = "SELECT id, nome FROM mestre";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mestre p = new Mestre();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            Mestres.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Mestres;
    }
    
    public void atualizar(Mestre p) throws Exception {
        
        Connection c = obterConexao();
        String sql = "UPDATE mestre SET nome = ? WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, p.getNome());
        stmt.setInt(2, p.getId());
        
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível atualizar este Mestre");
        }
    }

    public void remover(Mestre p) throws Exception {
        Connection c = obterConexao();
        String sql = "DELETE FROM mestre WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, p.getId());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível remover este Mestre");
        }
    }

    public Mestre obter(int codigo) throws Exception {
        Mestre p = null;
        Connection c = obterConexao();
        String sql = "SELECT id, nome FROM mestre WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, codigo);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            p = new Mestre();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (p == null) {
            throw new Exception("Não foi possível localizar este Mestre");
        }
        return p;
    }

    public List<Mestre> obterPorNome(String nome) throws Exception {
        if (nome == null || nome.trim().length() == 0) {
            nome = "%";
        } else {
            nome = "%" + nome.toUpperCase() + "%";
        }
        
        List<Mestre> Mestres = new ArrayList<Mestre>();
        Connection c = obterConexao();
        String sql = "SELECT id, nome FROM mestre WHERE upper(nome) LIKE ? ";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mestre p = new Mestre();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            Mestres.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Mestres;
    }
    
}
