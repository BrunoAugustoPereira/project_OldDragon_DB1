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
public class PersonagemDAO extends DAO {
    public void inserir(Personagem p) throws Exception {
        Connection c = obterConexao();
        String sql = "INSERT INTO public.personagem(nome, nivel, alinhamento, idade, tamanho, forca, destreza, constituicao, sabedoria, carisma, inteligencia, raca, classe, jogador, mestre) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1,p.getNome());
        stmt.setInt(2,p.getNive());
        stmt.setString(3,p.getAlinhamento());
        stmt.setInt(4,p.getIdade());
        stmt.setInt(5,p.getTamanho());
        stmt.setInt(6,p.getForca());
        stmt.setInt(7,p.getDestreza());
        stmt.setInt(8,p.getConstituicao());
        stmt.setInt(9,p.getSabedoria());
        stmt.setInt(10,p.getCarisma());
        stmt.setInt(11,p.getInteligencia());
        stmt.setInt(12,p.getRaca());
        stmt.setInt(13,p.getClasse());
        stmt.setInt(14,p.getJogador());
        stmt.setInt(15,p.getMestre());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir este personagem");
        }
            
           
    }
     public List<Personagem> obterPorNome(String nome) throws Exception {
        if (nome == null || nome.trim().length() == 0) {
            nome = "%";
        } else {
            nome = "%" + nome.toUpperCase() + "%";
        }
        
        List<Personagem> Personagens = new ArrayList<Personagem>();
        Connection c = obterConexao();
        String sql = "SELECT id, nome FROM personagem WHERE upper(nome) LIKE ? ";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Personagem p = new Personagem();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            Personagens.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Personagens;
    }
     
      public List<Personagem> obterPorJogador(Jogador j) throws Exception {
     
        List<Personagem> Personagens = new ArrayList<Personagem>();
        Connection c = obterConexao();
        String sql = "select personagem.id ,personagem.nome ,nivel from personagem where personagem.jogador=?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, j.getId());
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Personagem p = new Personagem();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            p.setNive(rs.getInt("nivel"));
            Personagens.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return Personagens;
    }
    
       
    
}
