/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.OperacionesInterfaces;

/**
 *
 * @author alum.fial1
 */
public class Triangulo implements OperacionesInterfaces{
  private double a;
  private double b;



    public Triangulo(double a, double b) {
        this.a = a;
        this.b = b;
        
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return b;
    }

    public void setH(double b) {
        this.b = b;
    }

    
  
    @Override
    public double area() {
        return b*a*0.5;
        
    }

    @Override
    public double perimetro() {
        return 3*b;
        
    }
    
}
