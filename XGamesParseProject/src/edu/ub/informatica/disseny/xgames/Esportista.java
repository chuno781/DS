/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.informatica.disseny.xgames;

import java.util.ArrayList;

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
    private ArrayList<Resultat> resultats;
    private ArrayList<Medalla> or;
    private ArrayList<Medalla> plata;
    private ArrayList<Medalla> bronze;
    
    public Esportista(String id, String nom, String dni, String adreca, Data data, Pais p) {
        this.id=id;
        this.nom = nom;
        this.dni = dni;
        this.adreca=adreca;
        this.data=data;
        this.pais=p;
        this.resultats=new ArrayList();
        or=new ArrayList();
        plata=new ArrayList();
        bronze=new ArrayList();
        
    }

    boolean comprovar(String id) {
        return id.equals(this.id);
    }

    void imprimirDades() {
        XGamesXMLTest.escriu(id+"\t"+nom+"\t"+pais.getNom()+"\t"+data.getData()+"\n");
    }

    void addResultat(Resultat resultat) {
        resultats.add(resultat);
    }

    void addMedallaOr(Medalla m) {
        or.add(m);
        pais.addMedallaOr(m);
        m.setPais(pais);
    }

    void addMedallaPlata(Medalla m) {

        plata.add(m);
        pais.addMedallaPlata(m);
        m.setPais(pais);
    }

    void addMedallaBronze(Medalla m) {

        bronze.add(m);
        pais.addMedallaBronze(m);
        m.setPais(pais);
    }

    String getNom() {
        return nom;
    }

    Pais getPais() {
        return pais;
    }

    
}
