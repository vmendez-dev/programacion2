//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Haciendo pruebas para ver que el código funcione correctamente:

        Producto mouse = new Producto("Mouse", 10000, 5);
        Producto teclado = new Producto("Teclado", 25000, 3);
        Producto monitor = new Producto("Monitor", 120000, 2);

        ItemPedido item1 = new ItemPedido(mouse, 2);
        ItemPedido item2 = new ItemPedido(teclado, 5);  // Este supera el stock disponible
        ItemPedido item3 = new ItemPedido(monitor, 1);

        Pedido pedido = new Pedido("PED001");

        pedido.agregarItem(item1);
        pedido.agregarItem(item2);
        pedido.agregarItem(item3);

        System.out.println("Total: $" + pedido.calcularTotalPedido());

        pedido.actualizarEstado("Pendienteeee");

        System.out.println("\n===== STOCK ANTES DE PROCESAR =====");
        System.out.println(mouse.getNombre() + ": " + mouse.getCantidadDisponible());
        System.out.println(teclado.getNombre() + ": " + teclado.getCantidadDisponible());
        System.out.println(monitor.getNombre() + ": " + monitor.getCantidadDisponible());

        System.out.println("\n===== Validando STOCK =====");
        pedido.validarStockPedido();    //Acá, como el teclado tiene stock 3 y se pidieron 5, me pide ingresar una nueva cantidad


        System.out.println("\n===== TOTAL DESPUÉS DE VALIDAR STOCK =====");
        System.out.println("Total: $" + pedido.calcularTotalPedido());

        System.out.println("\n===== PROCESANDO PEDIDO =====");
        pedido.procesarPedido();

        System.out.println("\n===== STOCK DESPUÉS DE PROCESAR =====");
        System.out.println(mouse.getNombre() + ": " + mouse.getCantidadDisponible());
        System.out.println(teclado.getNombre() + ": " + teclado.getCantidadDisponible());
        System.out.println(monitor.getNombre() + ": " + monitor.getCantidadDisponible());

    }
}