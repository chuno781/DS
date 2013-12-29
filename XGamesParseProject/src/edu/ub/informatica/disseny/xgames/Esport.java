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
    private ArrayList<Disciplina> disciplines;
    private String id;
    
    public Esport(String id, String nom){
        this.id=id;
        this.nom=nom;
        disciplines= new ArrayList();
    }
    public Disciplina getDisciplina(String id) {
        boolean es1 = false;
        Disciplina dis=null;
        int i=0;
        while (i<this.disciplines.size() && es1==false){
            dis= this.disciplines.get(i);
            es1 = dis.comprovar(id);
            i++;
        }

        if (es1 == false){
           dis = null;
        }

        return dis;
    }

    public void crearDisciplina(String id, String nom) {
        disciplines.add(new Disciplina(id,nom));
    }

    public boolean comprovar(String idEsport) {
        return idEsport.equals(id);
        
    }

    public Prova getProva(String id) {
        Disciplina dis=null;
        Prova prova=null;
        int i = 0;
        boolean es1 = false;
        while(i<disciplines.size()&&es1==false){
            dis=disciplines.get(i);
            prova=dis.getProva();
            es1=prova.comprova(id);
            i++;
        }
        if (es1 == false){
           prova = null;
        }
            
        return prova;
    }

    void imprimirProves() {
        Disciplina dis=null;
        Prova prova=null;
        int i = 0;
        while(i<disciplines.size()){
            dis=disciplines.get(i);
            prova=dis.getProva();
            prova.imprDades();
            i++;
        }    
    }
    
    public String getNom(){
        return nom;
    }
    
     public boolean comprovarNom(String nomesport) {    
        return this.nom.equals(nomesport);
    }
    
    public void imprimirNom(String nom){
        
        System.out.println(nom);
    }
    
    public void llistarDisciplines(){
        
        Disciplina dis;
        int i=0;
        
            while (i<this.disciplines.size()){
                dis = this.disciplines.get(i);
                dis.imprimirNom();
                i++;
            }
    }
}
