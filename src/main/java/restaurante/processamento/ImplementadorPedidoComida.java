package restaurante.processamento;

public class ImplementadorPedidoComida implements ImplementadorPedido {
    @Override
    public String processarPedido() {
        return "Processando pedido de comida";
    }
}
