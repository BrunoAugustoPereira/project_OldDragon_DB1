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
            throw new Exception("Não foi possível inserir esta Classe");
        }
            
           
    }
     
     public List<Classe> obterTodos() throws Exception {
        List<Classe> Classes = new ArrayList<Classe>();
        Connection c = obterConexao();
        String sql = "SELECT id ,nome, dado_de_vida FROM classe";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Classe p = new Classe();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            Classes.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Classes;
    }
    
    

    public void remover(Classe p) throws Exception {
        Connection c = obterConexao();
        String sql = "DELETE FROM classe WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, p.getId());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível remover esta Classe");
        }
    }

    public Classe obter(int codigo) throws Exception {
        Classe p = null;
        Connection c = obterConexao();
        String sql = "SELECT id ,nome, dado_de_vida FROM classe where classe.id=?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, codigo);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            p = new Classe();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (p == null) {
            throw new Exception("Não foi possível localizar esta Classe");
        }
        return p;
    }

    public List<Classe> obterPorNome(String nome) throws Exception {
        if (nome == null || nome.trim().length() == 0) {
            nome = "%";
        } else {
            nome = "%" + nome.toUpperCase() + "%";
        }
        
        List<Classe> Classes = new ArrayList<Classe>();
        Connection c = obterConexao();
        String sql = " SELECT id ,nome, dado_de_vida FROM classe where upper(nome) LIKE ? ";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Classe p = new Classe();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            Classes.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Classes;
    }
     
}
