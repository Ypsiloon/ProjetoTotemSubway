package principal.telas.cliente.pedido;

import java.io.FileNotFoundException;

import principal.Ingrediente;
import principal.Pedido;
import principal.util.Prompt;

public class TelaAquecer {

	public static void mostrar(Pedido pedido) throws FileNotFoundException {
		Prompt.separador();
		System.out.println("Gostaria de aquecer seu lanche?");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
		System.out.println("[3] Voltar");

		int op = Prompt.lerInteiro();

		switch (op) {
		case 1:
			System.out.println("Aquecido!");
			System.out.println();
			break;
		case 2:
			break;
		case 3:
			TelaQueijo.mostrar(pedido);
			break;
		default:
			System.out.println("Opção não encontrada :(");
			TelaAquecer.mostrar(pedido);
			break;
		}
		TelaSalada.mostrar(pedido);
	}

}
