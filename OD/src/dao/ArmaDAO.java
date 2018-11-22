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
 * @author Leonardo Oliveira Moreira
 *
 * Classe que representa as ações de manipulação de dados na tabela pessoa
 */
public class ArmaDAO extends DAO {

    public void inserir(Arma a) throws Exception {
        Connection c = obterConexao();
        String sql = "INSERT INTO public.arma(nome, tipo_de_dano, tamanho, alcance, preco, dano, peso, chance_de_critico) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1,a.getNome());
        stmt.setString(2,a.getTipoDeDano());
        stmt.setString(3,a.getTamanho());
        stmt.setString(4,a.getAlcance());
        stmt.setInt(5,a.getPreco());
        stmt.setString(6,a.getDano());
        stmt.setInt(7,a.getPeso());
        stmt.setInt(8,a.getChanceDeCritico());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir esta Arma");
        }
    }
    public Arma obter(int codigo) throws Exception {
        Arma p = null;
        Connection c = obterConexao();
        String sql = "SELECT nome, tipo_de_dano, preco, dano FROM arma where arma.id=?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, codigo);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            p = new Arma();
            p.setNome(rs.getString("nome"));
            
            p.setTipoDeDano(rs.getString("tipo_de_dano"));
            p.setPreco(rs.getInt("preco"));
            p.setDano(rs.getString("dano"));
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (p == null) {
            throw new Exception("Não foi possível localizar esta arma");
        }
        return p;
    }
    
    public List<Arma> obterTodos() throws Exception {
        List<Arma> Armas = new ArrayList<Arma>();
        Connection c = obterConexao();
        String sql = "SELECT nome, tipo_de_dano, preco, dano FROM arma";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Arma p = new Arma();
            p.setNome(rs.getString("nome"));
            p.setTipoDeDano(rs.getString("tipo_de_dano"));
            p.setPreco(rs.getInt("preco"));
            p.setDano(rs.getString("dano"));
            Armas.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Armas;
    }
    public List<Arma> obterPorNome(String nome) throws Exception {
        if (nome == null || nome.trim().length() == 0) {
            nome = "%";
        } else {
            nome = "%" + nome.toUpperCase() + "%";
        }
        
        List<Arma> Armas = new ArrayList<Arma>();
        Connection c = obterConexao();
        String sql = "SELECT id, nome, tipo_de_dano, preco, dano FROM arma WHERE upper(nome) LIKE ? ";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Arma p = new Arma();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            p.setTipoDeDano(rs.getString("tipo_de_dano"));
            p.setPreco(rs.getInt("preco"));
            p.setDano(rs.getString("dano"));
            Armas.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Armas;
    }

    
        
}
