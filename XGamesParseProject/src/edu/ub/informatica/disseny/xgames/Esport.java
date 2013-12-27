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
public class Esport {
    
    private String nom;
    private String descripcio;
    private ArrayList<Disciplina> disciplines;
    
    public Esport(String nom, String descripcio){
        this.nom=nom;
        this.descripcio=descripcio;
        disciplines= new ArrayList();
    }
    
}
