/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacionn;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    public void juega() {
        reiniciaPartida();

        numeroAAdivinar = (int)(Math.random() * 11); // 0 a 10
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina un número entre 0 y 10:");

        while (true) {
            int intento = sc.nextInt();

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (intento < numeroAAdivinar) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }

                if (quitaVida()) {
                    System.out.println("Intenta de nuevo:");
                } else {
                    System.out.println("Game Over. El número era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
}
