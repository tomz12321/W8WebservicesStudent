/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.ejb.Singleton;

/**
 *
 * @author tomz123
 */
@Singleton
public class NameStorageBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    // name field
    private String name = "World";
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}
