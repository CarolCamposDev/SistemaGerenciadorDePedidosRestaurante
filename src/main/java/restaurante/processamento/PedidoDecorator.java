package restaurante.processamento;

import restaurante.pedidos.Pedido;

public class PedidoDecorator implements Pedido {
    protected Pedido pedidoDecorator;

    public PedidoDecorator(Pedido pedidoDecorator) {
        this.pedidoDecorator = pedidoDecorator;
    }

    @Override
    public String exibir() {
        return pedidoDecorator.exibir();
    }
}
