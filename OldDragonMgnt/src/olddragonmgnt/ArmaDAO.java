/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olddragonmgnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author aluno
 */
public class ArmaDAO {
    public static String URL= "jdbc:postgresql://localhost:5432/OD";
    public static String USUARIO= "postgres";
    public static String SENHA= "password";
    Connection c = null;
    
    public void insertNewWeapon(String nome, String tipoDeDano, String tamanho, String alcance, int preco , String dano, int peso, int chanceDeCritico ) throws SQLException{
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(URL, USUARIO, SENHA); 
            String sql = "INSERT INTO public.arma(nome, tipo_de_dano, tamanho, alcance, preco, dano, peso, chance_de_critico) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1,nome);
            stmt.setString(2,tipoDeDano);
            stmt.setString(3,tamanho);
            stmt.setString(4,alcance);
            stmt.setInt(5,preco);
            stmt.setString(6,dano);
            stmt.setInt(7,peso);
            stmt.setInt(8,chanceDeCritico);

            int resultado = stmt.executeUpdate();
            if (resultado == 1) {
            System.out.println("arma inserida com sucesso");
            } else {
            System.out.println("Não foi possível inserir esta arma");
            }
            stmt.close();
            c.close();
        } 
        catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } 
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
   

    }
}
