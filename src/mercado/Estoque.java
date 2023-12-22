package mercado;

import java.util.ArrayList;
import java.util.List;


public class Estoque implements OperacoesEstoque {
	
	private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }
    
    public void listarProdutos(Produto produto) {
    	
    }

}
