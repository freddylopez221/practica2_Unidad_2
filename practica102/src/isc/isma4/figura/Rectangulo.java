/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figura;

/**
 *
 * @author Lopez
 */
public class Rectangulo extends Figura {
  
double base;
double altura;

public Rectangulo() {}

public Rectangulo(double base, double altura){
    this.base=base;
    this.altura=altura;
}

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}