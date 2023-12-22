package mercado.pedido;

import java.util.Map;

public class ItemPedidoPersonalizado extends ItemPedido {
	
	private Map<String, Integer> ingredientes; 

    public ItemPedidoPersonalizado(String descricao, double precoUnitario, Map<String, Integer> ingredientes) {
        super(descricao, precoUnitario);
        this.ingredientes = ingredientes;
    }

    @Override
    public double calcularValor() {
    	return precoUnitario;
        
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " (Personalizado)";
    }

}
