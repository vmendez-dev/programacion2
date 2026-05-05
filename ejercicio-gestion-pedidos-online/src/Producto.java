public class Producto {
    //Constructor:
    public Producto(String nombre, double precio, int cantidadDisponible){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidadDisponible=cantidadDisponible;
    }

    //Atributos:
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    //Propiedades:
    public String getNombre() { return nombre; }

    public double getPrecio() { return precio; }

    public int getCantidadDisponible() { return cantidadDisponible; }
}
