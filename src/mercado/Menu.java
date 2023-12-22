package mercado;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int op;
		
		do {
			
			System.out.println("***************************************************");
			System.out.println("                                                   ");
			System.out.println("             Bem vindo ao Mercado da Vila!         ");
			System.out.println("                                                   ");
			System.out.println("***************************************************");
			System.out.println("                                                   ");
			System.out.println("             1 - Ver Produtos disponiveis          ");
			System.out.println("             2 - Ver Pedidos                       ");
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
			
			
			
		}while (op != 0);
		
		                                                  
	
		
		
		scanner.close();
	}
	
	

}
