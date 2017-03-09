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
public class industria extends estudiantes {
  double azulfuerte;
    public industria (double azulfuerte){
        this.azulfuerte = azulfuerte;
                
    }
    @Override
    public double getColor(){
    return azulfuerte;
}  
}