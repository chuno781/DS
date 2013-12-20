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
public class Disciplina {
    
    private String nom;
    private Prova prova;
    private ArrayList<Esportista> esportistes;
    private Resultat record;
    
    
    public Disciplina(String nom){
        
        this.nom = nom;
        esportistes= new ArrayList();
        
    }
    
    
}
