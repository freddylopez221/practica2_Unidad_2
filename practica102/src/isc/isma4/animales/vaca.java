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
public class vaca extends animales {
 double muu;
 
    public vaca (double muu){
        this.muu = muu;
}

    @Override
    public double getSonido() {
        return muu;
    }
    }
