package principal.telas.cliente;

import java.io.FileNotFoundException;

import principal.Pedido;
import principal.telas.cliente.pedido.TelaBebida;
import principal.telas.cliente.pedido.TelaMontarSeuLanche;
import principal.telas.cliente.pedido.TelaSobremesa;
import principal.util.Prompt;

public class TelaCliente {

	public static void mostrarMenu() throws FileNotFoundException {
		Pedido pedido = new Pedido();
		System.out.println("======== MENU ========");
		System.out.println("[1] Montar seu lanche");
		System.out.println("[2] Bebidas");
		System.out.println("[3] Sobremesas");
		System.out.println("[4] Finalizar Pedido");
		System.out.println("[5] Cancelar pedido");

		int op = Prompt.lerInteiro();
		switch (op) {
		case 1:
			TelaMontarSeuLanche.mostrar(pedido);
			break;

		case 2:
			TelaBebida.mostrar(pedido);
			break;

		case 3:
			TelaSobremesa.mostrar(pedido);
			break;

		case 4:
			TelaPedido.apresentarPedido();
			break;

		case 5:
			System.out.println("Volte sempre!");
			System.out.println();
			System.exit(1);
			break;

		default:
			System.out.println("Opção inválida!");
			TelaCliente.mostrarMenu();
			break;
		}
	}

}
