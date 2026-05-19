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

}
