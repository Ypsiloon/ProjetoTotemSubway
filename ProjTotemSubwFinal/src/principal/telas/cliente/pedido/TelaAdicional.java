package principal.telas.cliente.pedido;

import java.io.FileNotFoundException;

import principal.Ingrediente;
import principal.telas.cliente.Pagamento;
import principal.telas.cliente.TelaCliente;
import principal.telas.cliente.TelaPedido;
import principal.telas.cliente.TelaRemoverPedido;
import principal.util.Prompt;
import principal.Pedido;

public class TelaAdicional {
	static int i = -1;
	public static void mostrar(Pedido pedido) throws FileNotFoundException {
		
			System.out.println("Quais adicionais deseja?");
			System.out.println("[1] Bacon                     R$3,90");
			System.out.println("[2] Cheddar cremoso           R$3,90");
			System.out.println("[3] Cream cheese              R$3,90");
			System.out.println("[4] Dobro de queijo           R$3,90");
			System.out.println("[5] Peperoni                  R$3,90");
			System.out.println("[6] Cheddar vegano cremoso    R$3,90");
			System.out.println("[7] Salame                    R$4,00");
			System.out.println("[8] CONCLUIR");
			System.out.println("[9] Voltar");
			i++;
			int op2 = Prompt.lerInteiro();
			switch (op2) {
			case 1:
				System.out.println("Bacon selecionado!");
				pedido.addAdicionais(new Ingrediente("Bacon", 3.90));
				System.out.println();
				break;

			case 2:
				System.out.println("Cheddar cremoso selecionado!");
				pedido.addAdicionais(new Ingrediente("Cheddar cremoso", 3.90));
				System.out.println();
				break;

			case 3:
				System.out.println("Cream cheese selecionado!");
				pedido.addAdicionais(new Ingrediente("Cream cheese", 3.90));
				System.out.println();
				break;
			case 4:
				System.out.println("Dobro de queijo selecionado!");
				pedido.addAdicionais(new Ingrediente("Dobro de queijo", 3.90));
				System.out.println();
				break;
			case 5:
				System.out.println("Pepperoni selecionado!");
				pedido.addAdicionais(new Ingrediente("Pepperoni", 3.90));
				System.out.println();
				break;
			case 6:
				System.out.println("Cheddar vegano cremoso selecionado!");
				pedido.addAdicionais(new Ingrediente("Cheddar vegano cremoso", 3.90));
				System.out.println();
				break;
			case 7:
				System.out.println("Salame selecionado!");
				pedido.addAdicionais(new Ingrediente("Salame", 4));
				System.out.println();
				break;
			case 8:
				TelaPedido.mostrarLanche(pedido);
				TelaCliente.mostrarMenu();
				break;
			case 9:
				for (int j = 0; j < i; j++) {
					pedido.removerAdicionais(0);
				}
				System.out.println("Todas os molhos e adiconais foram removidos!");
				TelaSalada.mostrar(pedido);
				break;
			default:
				System.out.println("Opção não encontrada :(");
				System.out.println();
				TelaAdicional.mostrar(pedido);
				break;
			}
			TelaAdicional.mostrar(pedido);

		}
	}


//	Bacon	R$ 3,90
//	Cheddar cremoso	R$ 3,90
//	Cream cheese	R$ 3,90
//	Dobro de queijo	R$ 3,90
//	Pepperoni	R$ 3,90
//	Cheddar vegano cremoso	R$ 3,90
//	Salame	R$ 4,00