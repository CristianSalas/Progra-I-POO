/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrahorarios;

/**
 *
 * @author Cristian
 */
public class Semester {
    private int intSemester = 8;
    private int intCantCourses;
    
    /** This method is Semester's constructor
     * 
     * @param intCantCourses 
     */
    public Semester(int intCantCourses) {
        this.intCantCourses = intCantCourses;
    }

    public int getIntSemester() {
        return intSemester;
    }

    public void setIntSemester(int intSemester) {
        this.intSemester = intSemester;
    }

    public int getIntCantCourses() {
        return intCantCourses;
    }

    public void setIntCantCourses(int intCantCourses) {
        this.intCantCourses = intCantCourses;
    }
}