/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicabiblioteca;

/**
 *
 * @author Usuario
 */
public class PracticaBiblioteca {

    public static void main(String[] args) {

        Biblioteca biblioteca =
                new Biblioteca("Biblioteca UMSA");

        Autor autor1 =
                new Autor("Gabriel Garcia Marquez",
                          "Colombiano");

        Autor autor2 =
                new Autor("Mario Vargas Llosa",
                          "Peruano");

        biblioteca.agregarAutor(autor1);
        biblioteca.agregarAutor(autor2);

        String[] paginasLibro1 = {

            "Muchos años despues...",
            "El coronel Aureliano...",
            "Macondo era un pueblo..."
        };

        Libro libro1 =
                new Libro("Cien años de soledad",
                          "ISBN-111",
                          paginasLibro1);

        String[] paginasLibro2 = {

            "La ciudad y los perros...",
            "La disciplina militar...",
            "Los cadetes estudiaban..."
        };

        Libro libro2 =
                new Libro("La ciudad y los perros",
                          "ISBN-222",
                          paginasLibro2);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        Estudiante estudiante1 =
                new Estudiante("2025001",
                               "Carlos Perez");

        biblioteca.prestarLibro(estudiante1,
                                libro1);

        biblioteca.mostrarEstado();

        libro1.leer();

        biblioteca.cerrarBiblioteca();
    }
}
   
