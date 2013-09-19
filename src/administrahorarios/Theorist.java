/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrahorarios;

/**
 *
 * @author Cristian
 */
public class Theorist extends Subjects{
    private String strWebSite;

    /** This method is Theorist's constructor
     * 
     * @param strWebSite
     * @param strName
     * @param intCredits 
     */
    public Theorist(String strWebSite, String strName, int intCredits) {
        super(strName, intCredits);
        this.strWebSite = strWebSite;
    }

    public String getStrWebSite() {
        return strWebSite;
    }

    public void setStrWebSite(String strWebSite) {
        this.strWebSite = strWebSite;
    }
}
