public class ItemPedido {
    //Constructor:
    public ItemPedido(Producto producto, int cantidadSolicitada){
        if(cantidadSolicitada<1)
            throw new IllegalArgumentException("Error: La cantidad solicitada debe ser mayor o igual a 1");
        this.producto=producto;
        this.cantidadSolicitada=cantidadSolicitada;
    }

    //Atributos:
    private Producto producto;  //asociación de tipo 'agregación'
    private int cantidadSolicitada;

    //Propiedades:
    public Producto getProducto() { return producto; }

    public int getCantidadSolicitada() { return cantidadSolicitada; }
    public void setCantidadSolicitada(int cantidadSolicitada) { this.cantidadSolicitada=cantidadSolicitada; }

    //Métodos:
    public double calcularSubtotal(){
        return producto.getPrecio() * cantidadSolicitada;
    }
}
