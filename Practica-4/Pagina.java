/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicabiblioteca;

/**
 *
 * @author Usuario
 */
public class Pagina {

    private int numeroPagina;
    private String contenidoPagina;

    public Pagina(int numeroPagina, String contenidoPagina) {
        this.numeroPagina = numeroPagina;
        this.contenidoPagina = contenidoPagina;
    }

    public void mostrarInfo() {
        System.out.println("Pagina " + numeroPagina + ": " + contenidoPagina);
    }

    @Override
    public String toString() {
        return "Pagina " + numeroPagina;
    }
}
    
