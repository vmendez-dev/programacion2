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


}
