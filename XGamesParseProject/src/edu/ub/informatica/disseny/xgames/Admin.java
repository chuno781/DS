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
    
    public Admin(String id, String nom, String dni, String adreca, String usuari, String password, String data, String pais, String IDEmpleat){
        
        super(id,nom,dni,adreca,usuari,password,data,pais);
        this.IDEmpleat = IDEmpleat;
        
        
    }
}
