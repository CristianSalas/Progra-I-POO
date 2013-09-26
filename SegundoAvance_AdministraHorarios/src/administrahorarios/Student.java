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
public class Student extends Person{
    private String strCarrer = "Computacion";
    public static ArrayList<Student> listStudent = new ArrayList<>();
    /** This method is a Student's constrctor
     * 
     * @param name
     * @param identity
     * @param age
     * @param ID
     * @param code
     */
    public Student(String name, int identity, int age, int ID, int code) {
        super(name, identity, age, ID, code);
    }
    
}
