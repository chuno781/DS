/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ub.informatica.disseny.xgames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author User
 */
public class Prova {
    private String id;
    private String lloc;
    private Jutge jutge;
    private Data data;
    private ArrayList<Esportista> esportistes;
    private Disciplina disciplina;
    private ArrayList<Resultat> resultats;

    Prova(String id, Jutge jutge, String lloc, Data data,Disciplina d) {
        this.id=id;
        this.jutge=jutge;
        this.lloc=lloc;
        this.data=data;
        this.disciplina=d;
        esportistes=new ArrayList();
        this.resultats=new ArrayList();

    }

    boolean comprova(String id) {
        return id.equals(this.id);
    }

    void addEsportista(Esportista esp) {
        esportistes.add(esp);
    }

    void imprDades() {
        XGamesXMLTest.escriu(id+"\t"+disciplina.getNom()+"\t"+lloc+"\t"+data.getData()+"\n");
    }

    void registreResultats() {
        Esportista esp=null;
        int i=0;
        Resultat r;
        while (i<this.esportistes.size()){
            esp= this.esportistes.get(i);
            esp.imprimirDades();
            XGamesXMLTest.escriu("Quin resultat ha aconseguit el esportista de dalt?\n");
            double resultat=XGamesXMLTest.llegeixDouble();
            r=new Resultat(esp,resultat);
            esp.addResultat(r);
            resultats.add(r);
            i++;
        }
        orderResultats(resultats);
        r=resultats.get(0);
        disciplina.comprovaRecord(r);
        r.or();
        r=resultats.get(1);
        r.plata();
        r=resultats.get(2);
        r.bronze();

    }
       private void orderResultats(ArrayList<Resultat> resultats) {

    Collections.sort(resultats, new Comparator() {

        @Override
        public int compare(Object o1, Object o2) {
            Resultat r1=(Resultat)o1;
            Resultat r2=(Resultat)o2;
            double res1 = r1.getResultat();
            double res2 = r2.getResultat();
            return (int) (res2-res1);
        }
    });
}

    void imprResultats() {
        int i=0;
        while (i<this.resultats.size()){
            resultats.get(i).imprDades();
            i++;
        }
    }
}
