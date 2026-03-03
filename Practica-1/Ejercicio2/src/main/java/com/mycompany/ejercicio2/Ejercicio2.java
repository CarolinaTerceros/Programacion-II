/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Sistema de ecuaciones:");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        
        System.out.print("Ingrese a, b, c, d, e, f: ");
        
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double d = entrada.nextDouble();
        double e = entrada.nextDouble();
        double f = entrada.nextDouble();
        
        // Crear objeto
        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);
        
        // Verificar solución
        if (ecuacion.tieneSolucion()) {
            System.out.println("x = " + ecuacion.getX());
            System.out.println("y = " + ecuacion.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
        
        entrada.close();
    }
}

