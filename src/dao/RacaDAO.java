/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class RacaDAO extends DAO {
    
    public List<Raca> obterTodos() throws Exception {
        List<Raca> Racas = new ArrayList<Raca>();
        Connection c = obterConexao();
        String sql = "SELECT raca.id ,raca.nome, tamanho_usual, idade_maturidade, expectativa_de_vida, movimentacao_base, idioma.nome FROM raca, idioma WHERE raca.id_idioma=idioma.id";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Raca p = new Raca();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            Racas.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Racas;
    }
    
    

    public void remover(Raca p) throws Exception {
        Connection c = obterConexao();
        String sql = "DELETE FROM raca WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, p.getId());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível remover esta Raca");
        }
    }

    public Raca obter(int codigo) throws Exception {
        Raca p = null;
        Connection c = obterConexao();
        String sql = "SELECT raca.id ,raca.nome, tamanho_usual, idade_maturidade, expectativa_de_vida, movimentacao_base, idioma.nome FROM raca, idioma WHERE raca.id_idioma=idioma.id and raca.id=?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, codigo);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            p = new Raca();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (p == null) {
            throw new Exception("Não foi possível localizar esta Raca");
        }
        return p;
    }

    public List<Raca> obterPorNome(String nome) throws Exception {
        if (nome == null || nome.trim().length() == 0) {
            nome = "%";
        } else {
            nome = "%" + nome.toUpperCase() + "%";
        }
        
        List<Raca> Racas = new ArrayList<Raca>();
        Connection c = obterConexao();
        String sql = "SELECT raca.id ,raca.nome, tamanho_usual, idade_maturidade, expectativa_de_vida, movimentacao_base, idioma.nome FROM raca, idioma WHERE raca.id_idioma=idioma.id and upper(nome) LIKE ? ";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Raca p = new Raca();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            Racas.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Racas;
    }



}
