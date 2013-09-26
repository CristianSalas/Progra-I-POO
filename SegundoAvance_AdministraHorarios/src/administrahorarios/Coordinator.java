/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrahorarios;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class Coordinator extends Person{

    /** This method is Coordinator's constructor
     * 
     * @param name
     * @param identity
     * @param age 
     * @param ID
     * @param code
     */
    public Coordinator(String name, int identity, int age, int ID, int code) {
        super(name, identity, age, ID, code);
    }
    
    public static ArrayList<Coordinator> listCoordinator = new ArrayList();
    
    public boolean verificCoordinator(int ID){
        boolean exists = false;
        
        if(listCoordinator.size() == 0){
            exists = false;
        }
        else{
            int i = 0;
            while(i < listCoordinator.size()){
                if(listCoordinator.get(i).getIntID() == ID){
                    exists = true;
                    break;
                }
                i++;
            }
        }
        return exists;
    }
    
    public void insertCoordinator(){
        listCoordinator.add(this);
        /*boolean exists;
        exists = verificCoordinator(this.getIntID());
        
        if(exists == true){
            JOptionPane.showMessageDialog(null, "The Coordinator already exists, you can't add");
        }
        else{
            listCoordinator.add(this); 
            JOptionPane.showMessageDialog(null, "The Coordinator ");
        }*/
    }
}