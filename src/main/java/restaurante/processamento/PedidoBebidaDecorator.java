package restaurante.processamento;

import restaurante.pedidos.Pedido;

public class PedidoBebidaDecorator extends PedidoDecorator{
    public PedidoBebidaDecorator(Pedido pedidoDecorator) {
        super(pedidoDecorator);
    }

    @Override
    public String exibir() {
        return super.exibir() + ", com opção de gelo";
    }
}
