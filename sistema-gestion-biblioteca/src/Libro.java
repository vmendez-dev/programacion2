public class Libro {
    //Constructor:
    public Libro(String titulo, Autor autor, String isbn, int anioPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.anioPublicacion=anioPublicacion;
        disponible=true;
    }

    //Atributos:
    private String titulo;
    private Autor autor;
    private String isbn;
    private int anioPublicacion;
    private boolean disponible;

    //Métodos:
    public String getTitulo(){
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }
}
