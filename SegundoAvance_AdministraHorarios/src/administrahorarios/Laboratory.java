/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrahorarios;

/**
 *
 * @author Cristian
 */
public class Laboratory extends Classroom {
    private int intQuantityE;
    private String strEquipment;

    /** This method is Laboratory's constructor
     * 
     * @param strQuantityE
     * @param strEquipment
     * @param strName
     * @param intNumClass
     * @param strLocation
     * @param intCapacity 
     */
    
    public Laboratory(int strQuantityE, String strEquipment, String strName, int intNumClass, String strLocation, int intCapacity) {
        super(strName, intNumClass, strLocation, intCapacity);
        this.intQuantityE = strQuantityE;
        this.strEquipment = strEquipment;
    }
    
    public int getIntQuantityE() {
        return intQuantityE;
    }

    public void setStrQuantityE(int intQuantityE) {
        this.intQuantityE = intQuantityE;
    }

    public String getStrEquipment() {
        return strEquipment;
    }

    public void setStrEquipment(String strEquipment) {
        this.strEquipment = strEquipment;
    }
    
    
    
}
