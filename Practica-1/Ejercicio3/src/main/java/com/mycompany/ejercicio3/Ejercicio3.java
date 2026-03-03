/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ecuación cuadrática: ax^2 + bx + c = 0");
        System.out.print("Ingrese a, b, c: ");

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);

        double discriminante = ecuacion.getDiscriminante();

        if (discriminante > 0) {
            System.out.println("La ecuación tiene dos raíces "
                    + ecuacion.getRaiz1() + " y " + ecuacion.getRaiz2());
        } 
        else if (discriminante == 0) {
            System.out.println("La ecuación tiene una raíz "
                    + ecuacion.getRaiz1());
        } 
        else {
            System.out.println("La ecuación no tiene raíces reales");
        }

        entrada.close();
    }
}
