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
public class Prova {
    private String id;
    private String lloc;
    private Jutge jutge;
    private Data data;
    private ArrayList<Esportista> esportistes;

    Prova(String id, Jutge jutge, String lloc, Data data) {
        this.id=id;
        this.jutge=jutge;
        this.lloc=lloc;
        this.data=data;
        esportistes=new ArrayList();
    }

    boolean comprova(String id) {
        return id.equals(this.id);
    }

    void addEsportista(Esportista esp) {
        esportistes.add(esp);
    }
    
}
