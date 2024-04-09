package restaurante.processamento;

public abstract class AbstracaoPedido {
    protected ImplementadorPedido implementador;

    public AbstracaoPedido(ImplementadorPedido implementador) {
        this.implementador = implementador;
    }

    abstract String processarPedido();
}
