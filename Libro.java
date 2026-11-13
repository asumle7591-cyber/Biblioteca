package Biblioteca;

// Clase Libro
class Libro {

    // Atributos del libro
    private String nombre;
    private String autor;
    private double precio;

    // Constructor
    public Libro(String nombre, String autor, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre; 
    }
    
    public String getAutor() {
        return autor;
    }
        
    public double getPrecio() {
        return precio;
    }
}