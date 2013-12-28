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
    
    private String id;
    private String nom;
    private String usuari;
    private String password;
    private String dni;
    private String adreca;
    private Pais pais;
    private Data data;
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
    
        boolean es = false;
        String usu1;
        
        usu1 = getUsuari();
        if (usu1.equals(usuari)){ 
            es = true;
        }
        
        return es;
    }
    
    public static String getNextID(){
        UsuariLogat.lastId++;
        return String.valueOf(lastId);
    }
    
    public void crearData(String data){
        
        Data data1 = new Data(data);
    }
    
    public void imprimirDades(){
        
        System.out.println("\n Username: "+ usuari + "Nom: "+ nom + ", Nacionalitat: "+ pais + ", Data: "+ data);
    }
    
    public String getUsuari() {
        return usuari;
    }
    
    public String getPassword() {
        return password;
    }
    
}
