package principal.telas.cliente.pedido;

import java.io.FileNotFoundException;

import principal.Ingrediente;
import principal.Pedido;
import principal.telas.cliente.TelaCliente;
import principal.telas.cliente.TelaPedido;
import principal.util.Prompt;

public class TelaSobremesa {

	public static void mostrar(Pedido pedidoSobremesa) throws FileNotFoundException {
		Prompt.separador();
		System.out.println("Selecione a opcao que deseja: ");
		System.out.println("[1] Sorvete   R$13,00");
		System.out.println("[2] Brownie   R$13,80");
		System.out.println("[3] Cookies");
		System.out.println("[4] Voltar");

		int op = Prompt.lerInteiro();
		switch (op) {
		case 1:
			pedidoSobremesa.addSobremesa(new Ingrediente("Sorvete", 13.0));
			System.out.println();
			break;
		case 2:
			pedidoSobremesa.addSobremesa(new Ingrediente("Brownie", 13.80));
			System.out.println();
			break;

		case 3:
			Prompt.separador();
			System.out.println("Selecione a opcao que deseja: ");
			System.out.println("[1] Tradicional   R$5,20");
			System.out.println("[2] Chocolate     R$5,20");
			System.out.println("[3] Voltar");
			op = Prompt.lerInteiro();

			switch (op) {
			case 1:
				pedidoSobremesa.addSobremesa(new Ingrediente("Cookie Tradicional", 5.20));
				System.out.println();
				break;
			case 2:
				pedidoSobremesa.addSobremesa(new Ingrediente("Cookie Chocolate", 5.20));
				System.out.println();
				break;
			case 3:
				TelaSobremesa.mostrar(pedidoSobremesa);
				break;
			default:
				System.out.println("Opção não encontrada :(");
				System.out.println();
				TelaSobremesa.mostrar(pedidoSobremesa);
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
		TelaPedido.mostrarSobremesa(pedidoSobremesa);
		TelaCliente.mostrarMenu();

	}

}
