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
public class administracion extends estudiantes {
    double rojo;
    public administracion (double rojo){
        this.rojo = rojo;
                
    }
    @Override
    public double getColor(){
    return rojo;
}
}
