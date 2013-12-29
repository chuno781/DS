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
    
    protected String id;
    protected String nom;
    protected String usuari;
    protected String password;
    protected String dni;
    protected String adreca;
    protected Pais pais;
    protected Data data;
    private static int lastId = 0;
    
    //public UsuariLogat(String username, String password, String nom, String dni, String adreca, String pais, Integer dia, Integer mes, Integer any){
    public UsuariLogat(String id, String nom, String dni, String adreca, String usuari, String password, Data data, Pais pais){
        
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
        return this.usuari.equals(usuari);
    }
    
    public static String getNextID(){
        UsuariLogat.lastId++;
        return String.valueOf(lastId);
    }
    
    
    public void imprimirDades(){
        
        System.out.println("Username: " +usuari+ " Nom: " +nom);
    }
    
    public String getUsuari() {
        return usuari;
    }
    
    public String getPassword() {
        return password;
    }
    
    public boolean comprovarId(String id) {    
        return this.id.equals(id);
    }
}
