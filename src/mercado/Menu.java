package mercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mercado.pedido.ItemPedido;
import mercado.pedido.ItemPedidoSimples;

public class Menu {

	private static Estoque estoque = new Estoque();
	private static List<ItemPedido> pedidoAtual = new ArrayList<>();
	private static int numeroPedidoAtual = 1;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int op;

		do {

			System.out.println("***************************************************");
			System.out.println("                                                   ");
			System.out.println("                    Café do seu Zé                 ");
			System.out.println("                                                   ");
			System.out.println("***************************************************");
			System.out.println("                                                   ");
			System.out.println("             1 - Ver Produtos disponiveis          ");
			System.out.println("             2 - O de sempre                       ");
			System.out.println("             3 - Buscar um Produto                 ");
			System.out.println("             4 - Cancelar um  Pedido               ");
			System.out.println("             5 - Adicionar um Produto ao estoque   ");
			System.out.println("             6 - Remover um Produto do estoque     ");
			System.out.println("             0 - Sair                              ");
			System.out.println("                                                   ");
			System.out.println("***************************************************");
			System.out.println("Entre com a opção desejada:");
			System.out.println("                                                   ");

			op = scanner.nextInt();
			String produto;
			switch (op) {
			case 1:
				System.out.println("Produtos Disponiveis");
				break;
			case 2:
				
				ODeSempre();
				break;
			case 3:
				System.out.println("Digite o nome de um produto");
				break;
			case 4:
				System.out.println("Digite o número do pedido");
				break;
			case 5:
				System.out.println("Digite o Nome do produto que voce deseja Adicionar");
				produto = scanner.next();

				break;
			case 6:
				System.out.println("Digite o Nome do produto que voce deseja Remover");
				break;
			case 0:
				System.out.println("\nObrigado por utilizar o Mercado da Vila !");
				System.out.println("\nVOLTE SEMPRE!");
				break;
			default:
				System.out.println("\nOpçao Inválida");
				break;
			}

		} while (op != 0);

		scanner.close();
	}

	private static void ODeSempre() {
		Produto pingado = new Produto("Café Pingado", 3.0);
		Produto paoNaChapa = new Produto("Pão na Chapa", 5.0);

		ItemPedidoSimples itemPingado = new ItemPedidoSimples(pingado.getNome(), pingado.getPreco(), 1);
		ItemPedidoSimples itemPaoNaChapa = new ItemPedidoSimples(paoNaChapa.getNome(), paoNaChapa.getPreco(), 1);

		pedidoAtual.add(itemPingado);
		pedidoAtual.add(itemPaoNaChapa);
		
		
        System.out.println("Número do Pedido: " + numeroPedidoAtual);
        System.out.println("Item 1: " + itemPingado.getDescricao());
        System.out.println("Item 2: " + itemPaoNaChapa.getDescricao());
        System.out.println("Total a Pagar: R$" + calcularTotalPedido());
        
        numeroPedidoAtual++;
	}
	private static void exibirPedido() {
		if (pedidoAtual.isEmpty()) {
	        System.out.println("Nenhum item no pedido.");
	        return;
	    }

	    System.out.println("Itens do Pedido:");
	    for (ItemPedido item : pedidoAtual) {
	        if (item instanceof ItemPedidoSimples) {
	            ItemPedidoSimples itemSimples = (ItemPedidoSimples) item;
	            System.out.println("Número do Pedido: " + itemSimples.getNumeroPedido());
	        }

	        System.out.println("Descrição: " + item.getDescricao());
	        System.out.println("Valor Unitário: R$" + item.calcularValor());
	        System.out.println("------------------------");
	    }

	    System.out.println("Total a Pagar: R$" + calcularTotalPedido());
	}

    private static double calcularTotalPedido() {
        double total = 0;
        for (ItemPedido item : pedidoAtual) {
            total += item.calcularValor();
        }
        return total;
    }

}
