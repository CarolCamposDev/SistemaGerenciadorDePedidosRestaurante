package restaurante.pedidos;

public class CriadorPedidoBebida extends CriadorPedido{
    @Override
    public Pedido criarPedido() {
        return new PedidoBebida();
    }
}
