/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicabiblioteca;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String codigo;
    private String nombre;

    public Estudiante(String codigo, String nombre) {

        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void mostrarInfo() {

        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
    }

    @Override
    public String toString() {
        return nombre + " [" + codigo + "]";
    }
}

