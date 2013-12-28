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
public class Medalla {
    private String tipus;
    private Resultat resultat;
    private Esportista esportista;
    private Pais pais;
    Medalla(String tipus, Resultat r) {
        this.tipus=tipus;
        this.resultat=r;
    }

    void setEsportista(Esportista esportista) {
        this.esportista=esportista;
    }

    void setPais(Pais pais) {
        this.pais=pais;
    }

    String getTipus() {
        return tipus;
    }

}
