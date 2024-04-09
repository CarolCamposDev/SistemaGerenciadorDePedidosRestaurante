package restaurante.pedidos;

public class PedidoComida implements Pedido{

    @Override
    public String exibir() {
        return "Pedido de comida";
    }
}
