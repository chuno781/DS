/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.informatica.disseny.xgames;

/**
 *
 * @author mat.aules
 */
public class UsuariLogat {
    
    String id;
    String nom;
    String usuari;
    String password;
    String dni;
    String adreca;
    String pais;
    String data;
    
    //public UsuariLogat(String username, String password, String nom, String dni, String adreca, String pais, Integer dia, Integer mes, Integer any){
    public UsuariLogat(String id, String nom, String dni, String adreca, String usuari, String password, String data, String pais){
        
        this.id = id;
        this.nom = nom;
        this.usuari = usuari;
        this.password = password;
        this.dni = dni;
        this.adreca = adreca;
        this.pais = pais;
        this.data = data;
    }
      
    public boolean comprovar(String usuari) {
    
        boolean es = false;
        String usu1;
        
        usu1 = getUsuari();
        if (usu1.equals(usuari)){ 
            es = true;
        }
        
        return es;
    }
    
    
    public String getUsuari() {
        return usuari;
    }
    
}
