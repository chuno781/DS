/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.informatica.disseny.xgames;

/**
 *
 * @author mat.aules
 */
public class Admin extends UsuariLogat {
    
    String IDEmpleat;
    
    public Admin(String nom, String username, String password, String IDEmpleat){
        
        super(nom,username,password);
        this.IDEmpleat = IDEmpleat;
        
        
    }
}
