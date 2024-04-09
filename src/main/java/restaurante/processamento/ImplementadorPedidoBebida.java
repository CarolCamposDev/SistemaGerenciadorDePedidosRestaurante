package restaurante.processamento;

public class ImplementadorPedidoBebida implements ImplementadorPedido {
    @Override
    public String processarPedido() {
        return "Processando pedido de bebida";
    }
}
