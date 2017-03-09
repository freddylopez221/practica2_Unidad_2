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
public class Hexagono extends Figura {
    double L;
    double ap;
    public Hexagono (double L, double ap){
        this.L = L;
        this.ap = ap;
    }
    
@Override
public double getArea(){
    return (L*ap)/2;
}
}
