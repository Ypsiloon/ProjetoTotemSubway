package principal.telas.cliente.pedido;

import java.io.FileNotFoundException;

import principal.Ingrediente;
import principal.Pedido;
import principal.telas.cliente.TelaCliente;
import principal.telas.cliente.TelaPedido;
import principal.util.Prompt;

public class TelaBebida {

	public static void mostrar(Pedido pedido) throws FileNotFoundException {

		Prompt.separador();
		System.out.println("Selecione a opcao que deseja: ");
		System.out.println("[1] Água");
		System.out.println("[2] Refrigerante");
		System.out.println("[3] Suco");
		System.out.println("[4] Voltar");

		int op = Prompt.lerInteiro();
		switch (op) {
		case 1:
			Prompt.separador();
			System.out.println("Selecione a opcao que deseja: ");
			System.out.println("[1] Água sem gás   R$6,00");
			System.out.println("[2] Água com gás   R$6,00");
			System.out.println("[3] Voltar");
			op = Prompt.lerInteiro();
			;
			switch (op) {
			case 1:
				pedido.addBebida(new Ingrediente("Água sem gás", 6.0));
				System.out.println();
				break;

			case 2:
				System.out.println();
				pedido.addBebida(new Ingrediente("Água com gás", 6.0));
				break;

			case 3:
				TelaBebida.mostrar(pedido);
				break;

			default:
				System.out.println("Opção não encontrada :(");
				System.out.println();
				TelaBebida.mostrar(pedido);
				break;

			}
			break;

		case 2:
			Prompt.separador();
			System.out.println("Selecione a opcao que deseja: ");
			System.out.println("[1] Coca-cola              R$9,60");
			System.out.println("[2] Coca-cola sem acucar   R$9,60");
			System.out.println("[3] Fanta Guaraná          R$9,60");
			System.out.println("[4] Voltar");

			op = Prompt.lerInteiro();
			switch (op) {
			case 1:
				pedido.addBebida(new Ingrediente("Coca-cola", 9.60));
				System.out.println();
				break;

			case 2:
				pedido.addBebida(new Ingrediente("Coca-cola sem acucar", 9.60));
				System.out.println();
				break;

			case 3:
				pedido.addBebida(new Ingrediente("Fanta Guaraná", 9.60));
				System.out.println();
				break;

			case 4:
				TelaBebida.mostrar(pedido);
				break;

			default:
				System.out.println("Opção não encontrada :(");
				System.out.println();
				TelaBebida.mostrar(pedido);
				break;

			}
			break;

		case 3:
			Prompt.separador();
			System.out.println("Selecione a opcao que deseja: ");
			System.out.println("[1] Del Valle (Maracuja)   R$8,40");
			System.out.println("[2] Del Valle (Uva)        R$8,40");
			System.out.println("[3] Del Valle (Laranja)    R$8,40");
			System.out.println("[4] Voltar");
			op = Prompt.lerInteiro();

			switch (op) {
			case 1:
				pedido.addBebida(new Ingrediente(" Del Valle (Maracuja)", 8.40));
				System.out.println();
				break;

			case 2:
				pedido.addBebida(new Ingrediente("Del Valle (Uva)", 8.40));
				System.out.println();
				break;

			case 3:
				pedido.addBebida(new Ingrediente("Del Valle (Laranja)", 8.40));
				System.out.println();
				break;

			case 4:
				TelaBebida.mostrar(pedido);
				break;

			default:
				System.out.println("Opção não encontrada :(");
				System.out.println();
				TelaBebida.mostrar(pedido);
				break;

			}
			break;

		case 4:
			System.out.println();
			TelaCliente.mostrarMenu();
			break;

		default:
			System.out.println("Opção inválida!");
			TelaCliente.mostrarMenu();
			break;

		}
		TelaPedido.mostrarBebida(pedido);
		TelaCliente.mostrarMenu();
	}

}
