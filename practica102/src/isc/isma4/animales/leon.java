/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.animales;

/**
 *
 * @author Lopez
 */
public class leon extends animales {
 double ruar;
 
    public leon (double ruar){
        this.ruar = ruar;
}

    @Override
    public double getSonido() {
        return ruar;
    }
    }
