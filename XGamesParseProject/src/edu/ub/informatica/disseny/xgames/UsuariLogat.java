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
    
    String nom;
    String username;
    String password;
    String dni;
    String adreca;
    String pais;
    Integer dia;
    Integer mes;
    Integer any;
    
    
    public UsuariLogat(String username, String password, String nom, String dni, String adreca, String pais, Integer dia, Integer mes, Integer any){
        
        this.nom = nom;
        this.username = username;
        this.password = password;
        this.dni = dni;
        this.adreca = adreca;
        this.pais = pais;
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }
    
}
