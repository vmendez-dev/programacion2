import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    //Constructor:
    public Pedido(String idPedido){
        this.idPedido=idPedido;
        this.estado="Pendiente";
        this.listaItems=new ArrayList<>();
    }

    //Atributos:
    private String idPedido;
    private String estado;  // Pendiente - Completado - Cancelado
    private List<ItemPedido> listaItems;

    //Propiedades:

    public String getIdPedido() { return idPedido; }

    public String getEstado() { return estado; }

    public List<ItemPedido> getListaItems() { return listaItems; }

    //Métodos:
    public void agregarItem(ItemPedido itemPedido) {
        listaItems.add(itemPedido);
    }
    public double calcularTotalPedido(){
        double totalPedido=0;
        for (ItemPedido item : listaItems) {
            totalPedido += item.calcularSubtotal();
        }
        return totalPedido;
    }
    public void actualizarEstado(String nuevoEstado){
        if(nuevoEstado.equalsIgnoreCase("Pendiente") ||
        nuevoEstado.equalsIgnoreCase("Completado") ||
        nuevoEstado.equalsIgnoreCase("Cancelado")){
            this.estado=nuevoEstado;
        }
        else
            System.out.println("Error: estado inválido.");

    }
    public void validarStockPedido(){
        Scanner sc = new Scanner(System.in);
        for (ItemPedido item : listaItems) {
            while(item.getCantidadSolicitada()>item.getProducto().getCantidadDisponible()){
                System.out.println("No hay stock suficiente para: "+item.getProducto().getNombre());
                System.out.println("Cantidad solicitada: "+item.getCantidadSolicitada());
                System.out.println("Stock disponible: "+item.getProducto().getCantidadDisponible());
                //Simulación:
                System.out.print("Ingrese una nueva cantidad válida: ");
                int nuevaCantidad=sc.nextInt();
                item.setCantidadSolicitada(nuevaCantidad);
            }
            System.out.println("Cantidad confirmada para "+item.getProducto().getNombre() + ": "+item.getCantidadSolicitada());
        }
    }
    public void procesarPedido(){
        for (ItemPedido item : listaItems) {
            int cantidadProcesada=0;

            if(item.getProducto().getCantidadDisponible()==0){
                System.out.println("No hay stock disponible para: "+item.getProducto().getNombre());
                continue;
            }
            do {
                item.getProducto().reducirStock(1);
                cantidadProcesada++;

                System.out.println("Empaquetando 1 unidad "+item.getProducto().getNombre()+"...");
            }while(cantidadProcesada<item.getCantidadSolicitada() && item.getProducto().getCantidadDisponible()>0);

            if(cantidadProcesada==item.getCantidadSolicitada())
                System.out.println("Item '"+item.getProducto().getNombre()+"' procesado correctamente");
            else
                System.out.println("Del Item '"+item.getProducto().getNombre()+"' se empaquetó solo "+cantidadProcesada+" unidades debido a falta de stock");
        }
        actualizarEstado("Completado");
    }
}
