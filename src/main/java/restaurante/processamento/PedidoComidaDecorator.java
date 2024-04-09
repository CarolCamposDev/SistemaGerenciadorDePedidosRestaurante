package restaurante.processamento;

import restaurante.pedidos.Pedido;

public class PedidoComidaDecorator extends PedidoDecorator{
    public PedidoComidaDecorator(Pedido pedidoDecorator) {
        super(pedidoDecorator);
    }

    @Override
    public String exibir() {
        return super.exibir() + ", com opção de sobremesa";
    }
}
