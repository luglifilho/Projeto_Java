package mercado.pedido;

public class ItemPedidoSimples extends ItemPedido{
	
	private int quantidade;
	private int numeroPedido;

    public ItemPedidoSimples(String descricao, double precoUnitario, int quantidade) {
        super(descricao, precoUnitario);
        this.quantidade = quantidade;
        this.numeroPedido = numeroPedido;
    }

    @Override
    public double calcularValor() {
        return precoUnitario * quantidade;
    }
    
    public int getNumeroPedido() {
        return numeroPedido;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " - Pedido #" + numeroPedido;
    }

}
