/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import dao.Jogador;
import dao.JogadorDAO;


/**
 *
 * @author Bruno Augusto
 */
public class maintotest {
   public static void main(String[] args) throws SQLException {
       try {
           JogadorDAO a = new JogadorDAO();
           DAO b = new DAO();
           b.obterConexao();
           //a.obterTodos();
           //System.out.println(a);
       } catch (Exception ex) {
           Logger.getLogger(maintotest.class.getName()).log(Level.SEVERE, null, ex);
       }
    } 
}

