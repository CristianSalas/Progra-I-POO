/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrahorarios;

/**
 *
 * @author Cristian
 */
public class Professor extends Person{
    private String strDepartment;
    
    /** This method is a Professor's constructor
     * 
     * @param name
     * @param identity
     * @param age
     * @param department 
     */
    public Professor(String name, int identity, int age, String department){
        super(name, identity, age);
        this.strDepartment = department;
    }

    public String getStrDepartment() {
        return strDepartment;
    }

    public void setStrDepartment(String strDepartment) {
        this.strDepartment = strDepartment;
    }
    
}
