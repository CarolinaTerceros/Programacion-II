/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplicacion;

/**
 *
 * @author Usuario
 */
public class Aplicacion {

    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        System.out.println("--Juego Normal--");
        juego1.juega();

        System.out.println("\n--Juego Par--");
        juego2.juega();

        System.out.println("\n--Juego Impar--");
        juego3.juega();
    }
}
