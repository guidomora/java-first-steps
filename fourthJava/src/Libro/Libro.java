package Libro;

import java.util.Comparator;

public class Libro implements Comparable <Libro> {
    private String titulo;
    private String autor;
    private int publicacion;
    private String isbn;

    public Libro (String titulo, String autor, int publicacion, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.isbn = isbn;
    }

    public String toString(){
        return titulo + "  " + autor + "  " + publicacion + "  " + isbn;
    }

    @Override
    public int compareTo(Libro libro2) {
        int result = this.titulo.compareTo(libro2.titulo);
        if (result != 0) {
            return result;
        }

        result = this.autor.compareTo(libro2.autor);
        if (result != 0) {
            return result;
        }

        return Integer.compare(this.publicacion, libro2.publicacion);
    }

    public static Comparator<Libro> compararPorAutor = new Comparator<Libro>() {
        @Override
        public int compare(Libro l1, Libro l2) {
            return l1.autor.compareTo(l2.autor);
        }
    };

    public static Comparator<Libro> compararPorAnoPublicacion = new Comparator<Libro>() {
        @Override
        public int compare(Libro l1, Libro l2) {
            return Integer.compare(l1.publicacion, l2.publicacion);
        }
    };
}

// Comparable define el orden natural
// Comparator permite definir distintos criterios de comparacion