/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicabiblioteca;

/**
 *
 * @author Usuario
 */
public class Horario {
    private String diasApertura;
    private String horaApertura;
    private String horaCierre;

    public Horario(String diasApertura, String horaApertura, String horaCierre) {

        this.diasApertura = diasApertura;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }

    public void mostrarHorario() {

        System.out.println("Dias: " + diasApertura);
        System.out.println("Hora apertura: " + horaApertura);
        System.out.println("Hora cierre: " + horaCierre);
    }

    @Override
    public String toString() {
        return diasApertura + " | " + horaApertura + " - " + horaCierre;
    }
}

