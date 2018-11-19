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
public class PessoaDAO extends DAO {

    public void inserir(Pessoa p) throws Exception {
        Connection c = obterConexao();
        String sql = "INSERT INTO pessoa (codigo, nome, login, senha) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, p.getCodigo());
        stmt.setString(2, p.getNome());
        stmt.setString(3, p.getLogin());
        stmt.setString(4, p.getSenha());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir esta pessoa");
        }
    }

    public void atualizar(Pessoa p) throws Exception {
        Connection c = obterConexao();
        String sql = "UPDATE pessoa SET nome = ?, login = ?, senha = ? WHERE codigo = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, p.getNome());
        stmt.setString(2, p.getLogin());
        stmt.setString(3, p.getSenha());
        stmt.setInt(4, p.getCodigo());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível atualizar esta pessoa");
        }
    }

    public void remover(Pessoa p) throws Exception {
        Connection c = obterConexao();
        String sql = "DELETE FROM pessoa WHERE codigo = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, p.getCodigo());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível remover esta pessoa");
        }
    }

    public Pessoa obter(int codigo) throws Exception {
        Pessoa p = null;
        Connection c = obterConexao();
        String sql = "SELECT codigo, nome, login, senha FROM pessoa WHERE codigo = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, codigo);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            p = new Pessoa();
            p.setCodigo(rs.getInt("codigo"));
            p.setNome(rs.getString("nome"));
            p.setLogin(rs.getString("login"));
            p.setSenha(rs.getString("senha"));
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (p == null) {
            throw new Exception("Não foi possível localizar esta pessoa");
        }
        return p;
    }

    public List<Pessoa> obterTodos() throws Exception {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Connection c = obterConexao();
        String sql = "SELECT codigo, nome, login, senha FROM pessoa";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Pessoa p = new Pessoa();
            p.setCodigo(rs.getInt("codigo"));
            p.setNome(rs.getString("nome"));
            p.setLogin(rs.getString("login"));
            p.setSenha(rs.getString("senha"));
            pessoas.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return pessoas;
    }

    public List<Pessoa> obterPorNomeELogin(String nome, String login) throws Exception {
        if (nome == null || nome.trim().length() == 0) {
            nome = "%";
        } else {
            nome = "%" + nome.toUpperCase() + "%";
        }
        if (login == null || login.trim().length() == 0) {
            login = "%";
        } else {
            login = "%" + login.toUpperCase() + "%";
        }
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Connection c = obterConexao();
        String sql = "SELECT codigo, nome, login, senha FROM pessoa WHERE upper(nome) LIKE ? AND upper(login) LIKE ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, login);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Pessoa p = new Pessoa();
            p.setCodigo(rs.getInt("codigo"));
            p.setNome(rs.getString("nome"));
            p.setLogin(rs.getString("login"));
            p.setSenha(rs.getString("senha"));
            pessoas.add(p);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return pessoas;
    }    
}
