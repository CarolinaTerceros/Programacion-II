/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Usuario
 */
public class Cronometro {
    
    //
    private long inicia;
    private long finaliza;
    
    //
    public Cronometro() {
        inicia = System.currentTimeMillis();
    }
    
    // Getter de inicia
    public long getInicia() {
        return inicia;
    }
    
    // Getter de finaliza
    public long getFinaliza() {
        return finaliza;
    }
    
    // Método inicia()
    public void inicia() {
        inicia = System.currentTimeMillis();
    }
    
    // Método detener()
    public void detener() {
        finaliza = System.currentTimeMillis();
    }
    
    // Método lapsoDeTiempo()
    public long lapsoDeTiempo() {
        return finaliza - inicia;
    }
}
   
