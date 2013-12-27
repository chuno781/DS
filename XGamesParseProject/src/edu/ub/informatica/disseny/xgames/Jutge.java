/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.informatica.disseny.xgames;

/**
 *
 * @author mat.aules
 */
public class Jutge extends UsuariLogat {
    
    Integer numColegiatInt;
    
    public Jutge(String username, String password, String nom, String dni, String adreca, String pais, int dia, int mes, int any, Integer numColegiatInt){
        
        super(username,password,nom,dni,adreca,pais,dia,mes,any);
        this.numColegiatInt = numColegiatInt;
        
        
    }
    
}
