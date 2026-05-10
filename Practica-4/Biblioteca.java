/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicabiblioteca;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Usuario
 */
public class Biblioteca {
    private String nombre;

    private Set<Libro> libros;
    private Set<Autor> autores;
    private Set<Prestamo> prestamos;

    private Horario horario;

    public Biblioteca(String nombre) {

        this.nombre = nombre;

        libros = new HashSet<Libro>();
        autores = new HashSet<Autor>();
        prestamos = new HashSet<Prestamo>();

        // COMPOSICION
        horario = new Horario("Lunes a Viernes",
                              "08:00",
                              "20:00");

        System.out.println("Biblioteca '" + nombre + "' creada");
    }

    public void agregarLibro(Libro libro) {

        libros.add(libro);

        System.out.println("Libro agregado: " + libro);
    }

    public void agregarAutor(Autor autor) {

        autores.add(autor);

        System.out.println("Autor agregado: " + autor);
    }

    public void prestarLibro(Estudiante estudiante,
                             Libro libro) {

        Prestamo prestamo = new Prestamo(
                "01/06/2026",
                "10/06/2026",
                estudiante,
                libro
        );

        prestamos.add(prestamo);

        System.out.println("Prestamo realizado correctamente");
    }

    public void mostrarEstado() {

        System.out.println("\n===== ESTADO DE LA BIBLIOTECA =====");

        System.out.println("\nNombre: " + nombre);

        System.out.println("\nHorario:");
        horario.mostrarHorario();

        System.out.println("\nLibros:");

        for (Libro l : libros) {
            System.out.println(l);
        }

        System.out.println("\nAutores:");

        for (Autor a : autores) {
            System.out.println(a);
        }

        System.out.println("\nPrestamos:");

        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }

    public void cerrarBiblioteca() {

        System.out.println("\nCerrando biblioteca...");

        prestamos.clear();

        System.out.println("Todos los prestamos fueron eliminados");
    }
}

