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
public class IdiomaPersonagemDAO extends DAO {

    public void inserir(IdiomaPersonagem a) throws Exception {
        Connection c = obterConexao();
        String sql = "INSERT INTO idioma_personagem (id_personagem , id_idioma) VALUES (?,?);";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1,a.getIdPersonagem());
        stmt.setInt(2,a.getIdIdioma());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir este Idioma");
        }
    }

    
        
}
