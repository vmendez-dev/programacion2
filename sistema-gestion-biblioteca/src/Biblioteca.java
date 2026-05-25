import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

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

    public void prestarLibro(String isbn, Usuario usuario) {
        Scanner sc = new Scanner(System.in);
        boolean prestado = false;

        do {
            boolean encontrado = false;

            for (Libro item : libros) {
                if (Objects.equals(item.getIsbn(), isbn)) {
                    encontrado=true;
                    if (item.isDisponible()) {
                        usuario.agregarLibroPrestado(item);
                        item.setDisponible(false);

                        System.out.println("Libro prestado correctamente: " + item.getTitulo());
                        prestado = true;
                        break;
                    } else {
                        System.out.println("El libro "+item.getTitulo()+" no se encuentra disponible.");
                    }
                    break;

                }
            }
            if (!prestado) {
                if(!encontrado)
                    System.out.print("No existe un libro con el ISBN: " + isbn);

                System.out.print("¿Desea intentar con otro ISBN? (si/no): ");
                String respuesta = sc.nextLine();

                if(respuesta.equalsIgnoreCase("si")){
                    System.out.print("Ingrese otro ISBN: ");
                    isbn = sc.nextLine();
                    
                } else{
                    System.out.println("Préstamo cancelado.");
                    break;
                }
            }

        } while (!prestado);
    }

}
