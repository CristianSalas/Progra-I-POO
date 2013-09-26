/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrahorarios;

/**
 *
 * @author Cristian
 */
public class Theory extends Classroom{
    private boolean boolAC;
    private boolean boolMEquipment;

    /** This methos is Theory's constructor
     * 
     * @param AC
     * @param mEquipment
     * @param strName
     * @param intNumClass
     * @param strLocation
     * @param intCapacity 
     */
    public Theory(boolean boolAC, boolean boolMEquipment, String strName, int intNumClass, String strLocation, int intCapacity) {
        super(strName, intNumClass, strLocation, intCapacity);
        this.boolAC = boolAC;
        this.boolMEquipment = boolMEquipment;
    }

    public boolean getBoolAC() {
        return boolAC;
    }

    public void setStrAC(boolean boolAC) {
        this.boolAC = boolAC;
    }

    public boolean getBoolMEquipment() {
        return boolMEquipment;
    }

    public void setBoolMEquipment(boolean boolMEquipment) {
        this.boolMEquipment = boolMEquipment;
    }
    
    
    
}
