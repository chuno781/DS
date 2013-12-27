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
    
    public Admin(String username, String password, String nom, String dni, String adreca, String pais, int dia, int mes, int any, String IDEmpleat){
        
        super(username,password,nom,dni,adreca,pais,dia,mes,any);
        this.IDEmpleat = IDEmpleat;
        
        
    }
}
