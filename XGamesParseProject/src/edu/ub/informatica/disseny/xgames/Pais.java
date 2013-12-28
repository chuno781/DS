/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ub.informatica.disseny.xgames;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Pais {
    private String id;
    private String nom;
    private ArrayList<Medalla> or;
    private ArrayList<Medalla> plata;
    private ArrayList<Medalla> bronze;
    private static int lastId = 0;

    public Pais(String id, String nom) {
        this.id=id;
        this.nom=nom;
        or=new ArrayList();
        plata=new ArrayList();
        bronze=new ArrayList();
    }
    
     public boolean comprovar(String pais) {
    
        boolean es = false;

        if (nom.equals(pais)){ 
            es = true;
        }
        
        return es;
    }
     
    int getOr() {
        return or.size();
    }

    int getPlata() {
        return plata.size();
    }

    int getBronze() {
        return bronze.size();
    }

    void imprMedalles() {
        String separacion="\t\t";
        if(nom.length()>8){
            separacion="\t";
        }
        XGamesXMLTest.escriu(nom+separacion+String.valueOf(getOr())+"\t"+String.valueOf(getPlata())+"\t"+String.valueOf(getBronze())+"\n");
    }
    
    
    public static String getNextID(){
        Pais.lastId++;
        return String.valueOf(lastId);
    }

    String getNom() {
        return nom;
    }

    void addMedallaOr(Medalla m) {
        or.add(m);
    }

    void addMedallaPlata(Medalla m) {
        plata.add(m);
    }

    void addMedallaBronze(Medalla m) {
        bronze.add(m);
    }
    
}
