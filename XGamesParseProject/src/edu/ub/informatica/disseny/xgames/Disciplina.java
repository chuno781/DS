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
    private String id;
    private static int lastId=0;
    
    public static String getNextID(){
        Disciplina.lastId++;
        return String.valueOf(lastId);
    }

    Disciplina(String id, String nom) {
        this.id = id;
        this.nom = nom;
        esportistes= new ArrayList();
    }

    void crearProva(String id, Jutge jutge, String lloc, Data data) {
        this.prova=new Prova(id,jutge,lloc,data);
        
    }

    public boolean comprovar(String idDisciplina) {
        return idDisciplina.equals(id);
        
    }
    
}
