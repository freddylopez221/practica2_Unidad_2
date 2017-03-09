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
public class pato extends animales {
 double cuua;
 
    public pato (double cuua){
        this.cuua = cuua;
}

    @Override
    public double getSonido() {
        return cuua;
    }
    }
