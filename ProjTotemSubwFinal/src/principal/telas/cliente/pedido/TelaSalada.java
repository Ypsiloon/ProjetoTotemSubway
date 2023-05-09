package principal.telas.cliente.pedido;

import java.io.FileNotFoundException;

import principal.Ingrediente;
import principal.Pedido;
import principal.util.Prompt;

public class TelaSalada {
	static int i = -1;
	static int qtdSalada = 0;

	public static void mostrar(Pedido pedido) throws FileNotFoundException {
		
		Prompt.separador();
		System.out.println("Quais tipos de salada deseja?(Maximo de 3)");
		System.out.println("[1] Alface");
		System.out.println("[2] Tomate");
		System.out.println("[3] Cebola roxa");
		System.out.println("[4] Pepino");
		System.out.println("[5] Pimentão");
		System.out.println("[6] Picles");
		System.out.println("[7] Azeitona");
		System.out.println("[8] CONCLUIR");
		System.out.println("[9] Voltar");
		qtdSalada++;
		i++;
		int op = Prompt.lerInteiro();
		if (qtdSalada == 4) {
			op = 8;
		}
		switch (op) {
		case 1:
			System.out.println("Alface selecionada!");
			pedido.addIngrediente(new Ingrediente("Alface", 0));
			System.out.println();
			break;

		case 2:
			System.out.println("Tomate selecionado!");
			pedido.addIngrediente(new Ingrediente("Tomate", 0));
			System.out.println();
			break;

		case 3:
			System.out.println("Cebola roxa selecionada!");
			pedido.addIngrediente(new Ingrediente("Cebola roxa", 0));
			System.out.println();
			break;
		case 4:
			System.out.println("Pepino selecionado!");
			pedido.addIngrediente(new Ingrediente("Pepino", 0));
			System.out.println();
			break;
		case 5:
			System.out.println("Pimentão selecionada!");
			pedido.addIngrediente(new Ingrediente("Pimentão", 0));
			System.out.println();
			break;
		case 6:
			System.out.println("Picles selecionada!");
			pedido.addIngrediente(new Ingrediente("Picles", 0));
			System.out.println();
			break;
		case 7:
			System.out.println("Azeitona selecionada!");
			pedido.addIngrediente(new Ingrediente("Azeitona", 0));
			System.out.println();
			break;
		case 8:
			TelaMolho.mostrar(pedido);
			break;
		case 9:
			for (int j = 0; j < i; j++) {
				pedido.removerIngrediente(4);
			}
			i = 0;
			qtdSalada = 0;
			System.out.println("Todas as saladas foram removidas!");
			TelaAquecer.mostrar(pedido);
			break;
		default:
			System.out.println("Opção não encontrada :(");
			System.out.println();
			TelaSalada.mostrar(pedido);
			break;
		}
		TelaSalada.mostrar(pedido);
	}

}
