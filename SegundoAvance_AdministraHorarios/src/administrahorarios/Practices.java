/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrahorarios;

/**
 *
 * @author Cristian
 */
public class Practices extends Subjects{
    private String strOS;
    private String strMaterial;
    
    /** This method are a Subjects constructor
     * 
     * @param strOS
     * @param strMaterial
     * @param strName
     * @param intCredits 
     */ 
    public Practices(String strOS, String strMaterial, String strName, int intCredits) {
        super(strName, intCredits);
        this.strOS = strOS;
        this.strMaterial = strMaterial;
    }

    public String getStrOS() {
        return strOS;
    }

    public void setStrOS(String strOS) {
        this.strOS = strOS;
    }

    public String getStrMaterial() {
        return strMaterial;
    }

    public void setStrMaterial(String strMaterial) {
        this.strMaterial = strMaterial;
    }
}
