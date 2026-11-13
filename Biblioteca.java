package Biblioteca;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {

    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {

        System.out.println("\n--- LIBROS REGISTRADOS ---");

        for (Libro libro : libros) {
            System.out.println(
                "Libro: " + libro.getNombre()
                + " | Autor: " + libro.getAutor()
                + " | Precio: $" + libro.getPrecio()
            );
        }
    }

    public double calcularValorTotal() {

        double total = 0;

        for (Libro libro : libros) {
            total += libro.getPrecio();
        }

        return total;
    }
}