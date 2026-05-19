import java.util.ArrayList;

public class Biblioteca {
    //Constructor:
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    //Atributos:
    private ArrayList<Libro> libros;

    //Métodos:
    public ArrayList<Libro> getLibros() {
        return libros;
    }
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
}
