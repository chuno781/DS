/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ub.informatica.disseny.xgames;

/**
 *
 * @author User
 */
public class Resultat {
    private Esportista esportista;
    private double puntuacio;
    private Medalla medalla;

    Resultat(Esportista esp, double resultat) {
        this.esportista=esp;
        this.puntuacio=resultat;
    }

    double getResultat() {
        return puntuacio;
    }

    void or() {
        Medalla m=new Medalla("or",this);
        esportista.addMedallaOr(m);
        m.setEsportista(esportista);
        medalla=m;
    }

    void plata() {

        Medalla m=new Medalla("plata",this);
        esportista.addMedallaPlata(m);
        m.setEsportista(esportista);
        medalla=m;
    }

    void bronze() {

        Medalla m=new Medalla("bronze",this);
        esportista.addMedallaBronze(m);
        m.setEsportista(esportista);
        medalla=m;
    }

    void imprDades() {
        String dades=esportista.getNom()+"\t"+esportista.getPais().getNom()+"\t"+puntuacio;
        if (medalla!=null){
            dades+="\t"+medalla.getTipus();
        }
        XGamesXMLTest.escriu(dades+"\n");
    }
    
}
