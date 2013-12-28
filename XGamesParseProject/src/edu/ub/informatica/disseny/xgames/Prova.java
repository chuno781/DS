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
public class Prova {
    private String id;
    private String lloc;
    private Jutge jutge;
    private Data data;

    Prova(String id, Jutge jutge, String lloc, Data data) {
        this.id=id;
        this.jutge=jutge;
        this.lloc=lloc;
        this.data=data;
    }

    boolean comprova(String id) {
        return id.equals(this.id);
    }
    
}
