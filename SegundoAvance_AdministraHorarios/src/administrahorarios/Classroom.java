/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrahorarios;

/**
 *
 * @author Cristian
 */
public class Classroom {
    private String strName;
    private int intNumClass;
    private String strLocation;
    private int intCapacity;
    
    /** This method is Classroom's constructor
     * 
     * @param strName
     * @param intNumClass
     * @param strLocation
     * @param intCapacity 
     */
    public Classroom(String strName, int intNumClass, String strLocation, int intCapacity) {
        this.strName = strName;
        this.intNumClass = intNumClass;
        this.strLocation = strLocation;
        this.intCapacity = intCapacity;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public int getIntNumClass() {
        return intNumClass;
    }

    public void setIntNumClass(int intNumClass) {
        this.intNumClass = intNumClass;
    }

    public String getStrLocation() {
        return strLocation;
    }

    public void setStrLocation(String strLocation) {
        this.strLocation = strLocation;
    }

    public int getIntCapacity() {
        return intCapacity;
    }

    public void setIntCapacity(int intCapacity) {
        this.intCapacity = intCapacity;
    }
    
    
    

    
}
