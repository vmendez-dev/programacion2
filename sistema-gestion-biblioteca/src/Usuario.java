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
}
