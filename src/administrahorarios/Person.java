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
    
    /** This method is Person's constructor
     * 
     * @param name
     * @param identity
     * @param age 
     */
    public Person(String name, int identity, int age){
        this.strName = name;
        this.intIdentity = identity;
        this.intAge = age;
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
}