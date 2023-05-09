package principal.telas.cliente.pedido;

import java.io.FileNotFoundException;

import principal.Ingrediente;
import principal.Pedido;
import principal.util.Prompt;

public class TelaQueijo {

	public static void mostrar(Pedido pedido) throws FileNotFoundException {

		Prompt.separador();
		System.out.println("Qual tipo de queijo deseja?");
		System.out.println("[1] Suíço");
		System.out.println("[2] Cheddar");
		System.out.println("[3] Mussarela Ralada");
		System.out.println("[4] Voltar");

		int op = Prompt.lerInteiro();
		switch (op) {
		case 1:
			System.out.println("Suiço selecionado!");
			pedido.addIngrediente(new Ingrediente("Suiço", 0));
			System.out.println();
			break;

		case 2:
			System.out.println("Cheddar selecionado!");
			pedido.addIngrediente(new Ingrediente("Cheddar", 0));
			System.out.println();
			break;

		case 3:
			System.out.println("Mussarela Ralada selecionada!");
			pedido.addIngrediente(new Ingrediente("Mussarela Ralada", 0));
			System.out.println();
			break;
		case 4:
			pedido.removerIngrediente(2);
			TelaCarne.mostrar(pedido);
			break;
		default:
			System.out.println("Opção não encontrada :(");
			System.out.println();
			TelaQueijo.mostrar(pedido);
			break;
		}
		TelaAquecer.mostrar(pedido);
	}

}
