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
public class Trapecio extends Figura {
double a;
    double b;
    double h;
    public Trapecio (double a, double b, double h){
    this.a = a;
    this.b = b;
    this.h = h;
    }
    @Override
    public double getArea(){
        return h*(a*b)/2;
    }
            
}
