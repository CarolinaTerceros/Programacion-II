/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author Usuario
 */
public class EcuacionCuadratica {
    
    private double a;
    private double b;
    private double c;

    
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método getDiscriminante()
    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    // Método getRaiz1()
    public double getRaiz1() {
        if (getDiscriminante() >= 0) {
            return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        } else {
            return 0;
        }
    }

    // Método getRaiz2()
    public double getRaiz2() {
        if (getDiscriminante() >= 0) {
            return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        } else {
            return 0;
        }
    }
}

