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
public class Data {
    
    private int dia;
    private int mes;
    private int any;
    
    public Data(int dia, int mes, int any){
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }
    public Data(String data){
        String [] dataSp=data.split("-");
        this.dia = Integer.valueOf(dataSp[0]);
        this.mes = Integer.valueOf(dataSp[1]);
        this.any = Integer.valueOf(dataSp[2]);
    }

    String getData() {
        return dia+"-"+mes+"-"+any;
    }
    
}
