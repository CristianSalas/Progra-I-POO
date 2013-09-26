/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrahorarios;

import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class Professor extends Person{
    private String strDepartment;
    public static ArrayList<Professor> listProfessor = new ArrayList<>();
    
    /** This method is a Professor's constructor
     * 
     * @param name
     * @param identity
     * @param age
     * @param ID
     * @param code
     * @param department 
     */
    public Professor(String name, int identity, int age,int ID, int code, String department){
        super(name, identity, age, ID, code);
        this.strDepartment = department;
    }

    public String getStrDepartment() {
        return strDepartment;
    }

    public void setStrDepartment(String strDepartment) {
        this.strDepartment = strDepartment;
    }
    
}
