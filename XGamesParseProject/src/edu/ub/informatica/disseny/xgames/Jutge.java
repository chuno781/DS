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
    
    private static int lastId = 0;
    public Jutge(String id, String nom, String dni, String adreca, String usuari, String password, Data data, Pais pais, Integer numColegiatInt){
        
        super(id,nom,dni,adreca,usuari,password,data,pais);
        this.numColegiatInt = numColegiatInt;
        
        
    }
    
    public boolean comprovarId(String id) {    
        return this.id.equals(id);
    }
    
    public static String getNextID(){
        Jutge.lastId++;
        return String.valueOf(lastId);
    }
    
    
}
