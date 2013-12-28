/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.informatica.disseny.xgames;

/**
 *
 * @author mat.aules
 */
public class Esportista {
    
    private String nom;
    private String id;
    private String dni;
    private String adreca;
    private Data data;
    private Pais pais;
    
    public Esportista(String id, String nom, String dni, String adreca, Data data, Pais p) {
        this.id=id;
        this.nom = nom;
        this.dni = dni;
        this.adreca=adreca;
        this.data=data;
        this.pais=p;
        
    }

    boolean comprovar(String id) {
        return id.equals(this.id);
    }
    
}
