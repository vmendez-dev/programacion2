public class ItemPedido {
    //Constructor:
    public ItemPedido(Producto producto, int cantidadSolicitada){
        this.producto=producto;
        if(cantidadSolicitada<1)
            throw new IllegalArgumentException("Error: La cantidad solicitada debe ser mayor o igual a 1");

        this.cantidadSolicitada=cantidadSolicitada;
    }

    //Atributos:
    private Producto producto;  //asociación de tipo 'agregación'
    private int cantidadSolicitada;

    //Propiedades:
    public Producto getProducto() { return producto; }

    public int getCantidadSolicitada() { return cantidadSolicitada; }

    //Métodos:
    public double calcularSubtotal(){
        return producto.getPrecio() * cantidadSolicitada;
    }
}
