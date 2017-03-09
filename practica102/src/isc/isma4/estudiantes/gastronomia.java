/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.estudiantes;

/**
 *
 * @author Lopez
 */
public class gastronomia extends estudiantes {
 double blanco;
    public gastronomia (double blanco){
        this.blanco = blanco;
                
    }
    @Override
    public double getColor(){
    return blanco;
}
}
