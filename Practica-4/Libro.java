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
public class Libro {
    private String titulo;
    private String isbn;
    private Set<Pagina> paginas;

    public Libro(String titulo, String isbn, String[] contenidoPaginas) {

        this.titulo = titulo;
        this.isbn = isbn;

        this.paginas = new HashSet<Pagina>();

        for (int i = 0; i < contenidoPaginas.length; i++) {

            Pagina pagina = new Pagina(i + 1, contenidoPaginas[i]);
            paginas.add(pagina);
        }

        System.out.println("Libro '" + titulo + "' creado correctamente");
    }

    public void leer() {

        System.out.println("\n=== Leyendo libro: " + titulo + " ===");

        for (Pagina p : paginas) {
            p.mostrarInfo();
        }
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo + " - ISBN: " + isbn;
    }

}
