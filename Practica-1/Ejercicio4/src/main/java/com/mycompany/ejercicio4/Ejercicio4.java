/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextDouble();
        }

        Estadistica estadistica = new Estadistica(numeros);

        System.out.printf("El promedio es %.2f\n", estadistica.promedio());
        System.out.printf("La desviación estándar es %.5f\n", estadistica.desviacion());

        entrada.close();
    }
}
