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
public class ArmaPersonagemDAO extends DAO {

    public void inserir(ArmaPersonagem a) throws Exception {
        Connection c = obterConexao();
        String sql = "INSERT INTO arsenal_personagem (id_personagem , arma) VALUES (?,?);";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1,a.getIdPersonagem());
        stmt.setInt(2,a.getArma());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir esta Arma");
        }
    }
    public List<ArmaPersonagem> obterTodosDoPersonagem(int perID) throws Exception {
        
        List<ArmaPersonagem> arsenal = new ArrayList<ArmaPersonagem>();
        Connection c = obterConexao();
        String sql = "SELECT id_personagem, arma FROM arsenal_personagem where id_personagem=?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, perID);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ArmaPersonagem p = new ArmaPersonagem();
            p.setIdPersonagem(rs.getInt("id_personagem"));
            p.setArma(rs.getInt("arma"));
            arsenal.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return arsenal;
    }
    
        
}
