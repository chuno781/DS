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
        record=new Resultat(null,0);
    }

    void crearProva(String id, Jutge jutge, String lloc, Data data) {
        this.prova=new Prova(id,jutge,lloc,data,this);
        jutge.addProva(prova);
        
    }

    public boolean comprovar(String idDisciplina) {
        return idDisciplina.equals(id);
        
    }

    Prova getProva() {
        return prova;
    }

    void comprovaRecord(Resultat r) {
        if(r.getResultat()>record.getResultat()){
            record=r;
        }
    }

    String getNom() {
        return nom;
    }
    
}
