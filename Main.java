package Biblioteca;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        String continuar;

        do {

            System.out.print("Ingrese el nombre del libro: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el autor del libro: ");
            String autor = sc.nextLine();
            
            System.out.print("Ingrese el precio del libro: ");
            double precio = sc.nextDouble();

            sc.nextLine();// Limpiar buffer
            
            Libro libro = new Libro(nombre, autor, precio);

            biblioteca.agregarLibro(libro);

            System.out.print("¿Desea agregar otro libro? (si/no): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        biblioteca.mostrarLibros();

        System.out.println("\nVALOR TOTAL DE LOS LIBROS: $" + 
        		biblioteca.calcularValorTotal());
        
        sc.close();
    }
}