package restaurante.pedidos;

public class PedidoBebida implements Pedido {

    @Override
    public String exibir() {
        return "Pedido de bebida";
    }
}