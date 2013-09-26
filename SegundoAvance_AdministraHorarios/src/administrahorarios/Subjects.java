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
public class Subjects {
    private String strName;
    private int intCredits;
    static ArrayList<Subjects> listSubjects = new ArrayList<>();

    public Subjects(String strName, int intCredits) {
        this.strName = strName;
        this.intCredits = intCredits;
    }
    
    
}
