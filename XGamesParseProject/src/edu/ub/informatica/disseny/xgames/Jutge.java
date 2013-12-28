/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.informatica.disseny.xgames;

import java.util.ArrayList;

/**
 *
 * @author mat.aules
 */
public class Jutge extends UsuariLogat {
    
    int numColegiatInt;
    
    private static int lastId = 0;
    private ArrayList<Prova> proves;
    public Jutge(String id, String nom, String dni, String adreca, String usuari, String password, Data data, Pais pais, int numColegiatInt){
        
        super(id,nom,dni,adreca,usuari,password,data,pais);
        this.numColegiatInt = numColegiatInt;
        proves=new ArrayList();
        
        
    }
    
    
    public static String getNextID(){
        Jutge.lastId++;
        return String.valueOf(lastId);
    }

    void addProva(Prova prova) {
        this.proves.add(prova);
    }

    void getProva() {
        XGamesXMLTest.escriu("ID Prova\tDisciplina\tLloc\tData\n");
        int i=0;
        while(i<proves.size()){
            proves.get(i).imprDades();
            i++;
        }
        XGamesXMLTest.escriu("Entra el id de la prova a actualitzar resultats.\n");
        String id=XGamesXMLTest.llegeixString();
        getProva(id).registreResultats();


    }

    private Prova getProva(String id) {
        int i=0;
        Prova prova=null;
        boolean es1 = false;
        while(i<proves.size()&&es1==false){
            prova=proves.get(i);
            es1=prova.comprova(id);
            i++;
        }
        if (es1 == false){
           prova = null;
        }
            
        return prova;
    }
    
    
}
