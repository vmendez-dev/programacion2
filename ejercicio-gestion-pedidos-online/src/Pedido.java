import java.util.ArrayList;
import java.util.List;

public class Pedido {
    //Constructor:
    public Pedido(String idPedido){
        this.idPedido=idPedido;
        this.estado="Pendiente";
        this.listaItems=new ArrayList<>();
    }

    //Atributos:
    private String idPedido;
    private String estado;  // Pendiente - Completado
    private List<ItemPedido> listaItems;

    //Propiedades:

    public String getIdPedido() { return idPedido; }

    public String getEstado() { return estado; }

    public List<ItemPedido> getListaItems() { return listaItems; }

    //Métodos:
    public void agregarItems(ItemPedido itemPedido) {
        listaItems.add(itemPedido);
    }
    public double calcularTotalPedido(){
        double totalPedido=0;
        for (ItemPedido item : listaItems) {
            totalPedido+=item.calcularSubtotal();
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
}
