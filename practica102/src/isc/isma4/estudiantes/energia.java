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
public class energia extends estudiantes {
    double negro;
    public energia (double negro){
        this.negro = negro;
                
    }
    @Override
    public double getColor(){
    return negro;
}
}
