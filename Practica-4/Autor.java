/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicabiblioteca;

/**
 *
 * @author Usuario
 */
public class Autor {

    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {

        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInfo() {

        System.out.println("Autor: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}
    
