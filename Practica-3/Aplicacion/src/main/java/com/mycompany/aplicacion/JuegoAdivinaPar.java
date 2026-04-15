/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                return true;
            } else {
                System.out.println("Error: El número debe ser PAR.");
                return false;
            }
        }
        return false;
    }

    @Override
    public void juega() {
        reiniciaPartida();

        numeroAAdivinar = (int)(Math.random() * 6) * 2; // 0,2,4,6,8,10

        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina un número PAR entre 0 y 10:");

        while (true) {
            int intento = sc.nextInt();

            if (!validaNumero(intento)) continue;

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

