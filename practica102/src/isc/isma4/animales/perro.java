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
public class perro extends animales {
 double Woof;
 
    public perro (double Woof){
        this.Woof = Woof;
}

    @Override
    public double getSonido() {
        return Woof;
    }
    }