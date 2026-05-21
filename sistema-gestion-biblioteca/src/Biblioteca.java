import java.util.ArrayList;
import java.util.Objects;

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

    public ArrayList<Libro> buscarPorTitulo(String valor) {
        ArrayList<Libro> resultadoLibro = new ArrayList<>();
        for (Libro item : libros) {
            if (item.getTitulo().equalsIgnoreCase(valor))
                resultadoLibro.add(item);
        }
        return resultadoLibro;
    }

    public ArrayList<Libro> buscarPorAutor(String valor) {
        ArrayList<Libro> resultadoLibro = new ArrayList<>();
        for (Libro item : libros) {
            String nombreAutor=item.getAutor().getNombre();
            if (nombreAutor.equalsIgnoreCase(valor))
                resultadoLibro.add(item);
        }
        return resultadoLibro;
    }


}
