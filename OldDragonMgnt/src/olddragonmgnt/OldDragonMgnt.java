/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olddragonmgnt;

import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class OldDragonMgnt {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        ArmaDAO arma= new ArmaDAO();
        arma.insertNewWeapon("teste", "TE", "G", "15/30", 500, "1d4", 500, 2);
    }
    
}
