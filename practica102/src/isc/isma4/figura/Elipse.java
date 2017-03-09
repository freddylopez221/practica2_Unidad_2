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
public class Elipse extends Figura {
    double radio;
    double radio2;
    public Elipse (double radio, double radio2){
        this.radio= radio;
        this.radio2= radio2;
    }

    @Override
    public double getArea() {
        return Math.PI*radio*radio2;
    }
}