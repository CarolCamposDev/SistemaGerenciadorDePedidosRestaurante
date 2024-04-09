package restaurante.pedidos;

public class CriadorPedidoComida extends CriadorPedido{
    @Override
    public Pedido criarPedido() {
        return new PedidoComida();
    }
}
