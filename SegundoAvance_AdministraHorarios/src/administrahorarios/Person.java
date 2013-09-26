/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrahorarios;

/**
 *
 * @author Cristian
 */
public abstract class Person {
    private String strName;
    private int intIdentity;
    private int intAge;
    private int intID;
    private int intCode;
    
    /** This method is Person's constructor
     * 
     * @param name
     * @param identity
     * @param age
     * @param ID
     * @param code
     */
    public Person(String name, int identity, int age, int ID, int code){
        this.strName = name;
        this.intIdentity = identity;
        this.intAge = age;
        this.intID = ID;
        this.intCode = code;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public int getIntIdentity() {
        return intIdentity;
    }

    public void setIntIdentity(int intIdentity) {
        this.intIdentity = intIdentity;
    }
    
    public int getIntAge() {
        return intAge;
    }
    
    public void setIntAge(int intAge) {
        this.intAge = intAge;
    }
    
    public int getIntID() {
        return intID;
    }
    
    public void setIntID(int ID) {
        this.intID = ID;
    }
    
    public int getIntCode() {
        return intCode;
    }
    
    public void setIntCode(int code) {
        this.intCode = code;
    }
}