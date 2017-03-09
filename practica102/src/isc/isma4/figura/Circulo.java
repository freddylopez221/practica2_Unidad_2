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
public class Circulo extends Figura {

double radio;
public Circulo(double radio){
    this.radio=radio;
}

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
