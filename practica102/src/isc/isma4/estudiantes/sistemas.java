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
public class sistemas extends estudiantes {
    double azulcielo;
    public sistemas (double azulcielo){
        this.azulcielo = azulcielo;
                
    }
    @Override
    public double getColor(){
    return azulcielo;
}
}
