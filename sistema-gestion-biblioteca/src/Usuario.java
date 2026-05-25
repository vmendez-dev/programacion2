import java.sql.SQLOutput;
import java.util.ArrayList;

public class Usuario {
    //Constructor:
    public Usuario(String idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    //Atributos:
    private String idUsuario;
    private String nombre;
    private ArrayList<Libro> librosPrestados;

    //Métodos:
    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
    public void agregarLibroPrestado(Libro libro){
        librosPrestados.add(libro);
    }

    public void mostrarLibrosPrestados() {
        if (librosPrestados.isEmpty())
            System.out.println("El usuario no tiene libros prestados.");
        else {
            System.out.println("====Libros Prestados====");
            for (Libro item : librosPrestados) {
                System.out.println("- " + item.getTitulo() + " | Autor: " + item.getAutor().getNombre());
            }
        }

    }
}
