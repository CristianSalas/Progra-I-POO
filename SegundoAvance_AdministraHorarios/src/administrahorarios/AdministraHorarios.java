/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrahorarios;

import Interfaces.*;

/**
 *
 * @author Cristian
 */
public class AdministraHorarios {
    public static String strNameUser = "Nito";
    public static CoordinatorWindow cW = new CoordinatorWindow();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Coordinator newCoordinator = new Coordinator("Cristian", 27234689, 19, 201301, 1);
      newCoordinator.insertCoordinator();
      
      new Login().setVisible(true);
    }
}
