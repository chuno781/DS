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
    public Pais(String id, String nom) {
        this.id=id;
        this.nom=nom;
        or=new ArrayList();
        plata=new ArrayList();
        bronze=new ArrayList();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
