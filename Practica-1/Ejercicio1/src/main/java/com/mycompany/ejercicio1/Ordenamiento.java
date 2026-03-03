/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Ordenamiento {
    
    private int[] arreglo;
    private int tamaño;
    
    
    public Ordenamiento(int tamaño) {
        this.tamaño = tamaño;
        arreglo = new int[tamaño];
        generarNumeros();
    }
    
    // Método números aleatorios
    private void generarNumeros() {
        Random r = new Random();
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = r.nextInt(100000);
        }
    }
    
    // Método de ordenación por selección
    public void ordenar() {
        for (int i = 0; i < tamaño - 1; i++) {
            int min = i;
            for (int j = i + 1; j < tamaño; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            
            // Intercambio
            int aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }
    }
}
   
