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
    
    public Jutge(String nom, String username, String password, Integer numColegiatInt){
        
        super(nom,username,password);
        this.numColegiatInt = numColegiatInt;
        
        
    }
    
}
