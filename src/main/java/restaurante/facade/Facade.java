package restaurante.facade;

import restaurante.pedidos.CriadorPedido;
import restaurante.pedidos.CriadorPedidoComida;
import restaurante.pedidos.CriadorPedidoBebida;
import restaurante.pedidos.Pedido;
import restaurante.processamento.AbstracaoPedido;
import restaurante.processamento.ImplementadorPedido;
import restaurante.processamento.ImplementadorPedidoComida;
import restaurante.processamento.ImplementadorPedidoBebida;
import restaurante.processamento.PedidoComidaDecorator;
import restaurante.processamento.PedidoBebidaDecorator;

public class Facade {
    private CriadorPedido criadorComida;
    private CriadorPedido criadorBebida;

    private ImplementadorPedido implementadorComida;
    private ImplementadorPedido implementadorBebida;

    public Facade() {
        criadorComida = new CriadorPedidoComida();
        criadorBebida = new CriadorPedidoBebida();

        implementadorComida = new ImplementadorPedidoComida();
        implementadorBebida = new ImplementadorPedidoBebida();
    }

    public String fazerPedidoComida() {
        Pedido pedidoComida = criadorComida.criarPedido();
        AbstracaoPedido pedidoComidaDecorado = new PedidoComidaDecorator(implementadorComida);
        return pedidoComidaDecorado.processarPedido();
    }

    public String fazerPedidoBebida() {
        Pedido pedidoBebida = criadorBebida.criarPedido();
        AbstracaoPedido pedidoBebidaDecorado = new PedidoBebidaDecorator(implementadorBebida);
        return pedidoBebidaDecorado.processarPedido();
    }

    public String adicionarItemPedido(String item) {
        return "Item '" + item + "' adicionado ao pedido.";
    }

    public String removerItemPedido(String item) {
        return "Item '" + item + "' removido do pedido.";
    }

    public String exibirMenu() {
        return "Menu do restaurante:\n- Comidas\n  - Prato 1\n  - Prato 2\n- Bebidas\n  - Bebida 1\n  - Bebida 2";
    }

}