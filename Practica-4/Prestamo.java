/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicabiblioteca;

/**
 *
 * @author Usuario
 */
public class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;

    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(String fechaPrestamo,
                     String fechaDevolucion,
                     Estudiante estudiante,
                     Libro libro) {

        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;

        this.estudiante = estudiante;
        this.libro = libro;
    }

    public void mostrarInfo() {

        System.out.println("\n=== PRESTAMO ===");
        System.out.println("Fecha prestamo: " + fechaPrestamo);
        System.out.println("Fecha devolucion: " + fechaDevolucion);
        System.out.println("Estudiante: " + estudiante);
        System.out.println("Libro: " + libro);
    }

    @Override
    public String toString() {

        return estudiante + " -> " + libro;
    }
}

