/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        int cantidad = 100000; // 100 mil números
        
        // Crear objeto de ordenamiento
        Ordenamiento ordenamiento = new Ordenamiento(cantidad);
        
        // Crear cronómetro
        Cronometro cronometro = new Cronometro();
        
        // Iniciar cronómetro
        cronometro.inicia();
        
        // Ejecutar ordenamiento
        ordenamiento.ordenar();
        
        // Detener cronómetro
        cronometro.detener();
        
        // Mostrar tiempo transcurrido
        System.out.println("Tiempo de ejecución (ms): " 
                + cronometro.lapsoDeTiempo());
    }
}

