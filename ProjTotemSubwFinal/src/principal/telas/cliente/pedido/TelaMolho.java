package principal.telas.cliente.pedido;

import java.io.FileNotFoundException;

import principal.Ingrediente;
import principal.Pedido;
import principal.telas.cliente.TelaCliente;
import principal.telas.cliente.TelaPedido;
import principal.util.Prompt;

public class TelaMolho {
	static int qtdMolho = -1;

	public static void mostrar(Pedido pedido) throws FileNotFoundException {
		Prompt.separador();
		System.out.println("Quais tipos de molho deseja?");
		System.out.println("[1] Barbecue");
		System.out.println("[2] Maionese");
		System.out.println("[3] Mostarda e mel");
		System.out.println("[4] Cebola Agridoce");
		System.out.println("[5] Chipotle");
		System.out.println("[6] Parmesão");
		System.out.println("[7] Supreme");
		System.out.println("[8] CONCLUIR");
		System.out.println("[9] Voltar");
		int op = Prompt.lerInteiro();
		qtdMolho++;
		
		if (qtdMolho == 3) {
			op = 8;
		}

		
		switch (op) {
		case 1:
			System.out.println("Barbecue selecionado!");
			pedido.addIngrediente(new Ingrediente("Barbecue", 0));
			System.out.println();
			break;

		case 2:
			System.out.println("Maionese selecionado!");
			pedido.addIngrediente(new Ingrediente("Maionese", 0));
			System.out.println();
			break;

		case 3:
			System.out.println("Mostarda e mel selecionado!");
			pedido.addIngrediente(new Ingrediente("Mostarda e mel", 0));
			System.out.println();
			break;
		case 4:
			System.out.println("Cebola Agridoce selecionado!");
			pedido.addIngrediente(new Ingrediente("Cebola Agridoce", 0));
			System.out.println();
			break;
		case 5:
			System.out.println("Chipotle selecionado!");
			pedido.addIngrediente(new Ingrediente("Chipotle", 0));
			System.out.println();
			break;
		case 6:
			System.out.println("Parmesão selecionado!");
			pedido.addIngrediente(new Ingrediente("Parmesão", 0));
			System.out.println();
			break;
		case 7:
			System.out.println("Supreme selecionado!");
			pedido.addIngrediente(new Ingrediente("Supreme", 0));
			System.out.println();
			break;
		case 8:
			System.out.println("Gostaria de algum adicional?");
			System.out.println("[1]Sim");
			System.out.println("[2]Não");
			int resp = Prompt.lerInteiro();
			if (resp == 1) {
				TelaAdicional.mostrar(pedido);
			} else {
				TelaPedido.mostrarLanche(pedido);
				TelaCliente.mostrarMenu();
			}
			break;

		case 9:
			for (int j = 0; j < (TelaSalada.i + qtdMolho); j++) {
				pedido.removerIngrediente(4);
			}
			TelaSalada.i = 0;
			int qtdMolho = 0;
			System.out.println("Todas os molhos e saladas foram removidos!");
			TelaSalada.mostrar(pedido);
			break;
		default:
			System.out.println("Opção não encontrada :(");
			System.out.println();
			TelaMolho.mostrar(pedido);
			break;
		}
		TelaMolho.mostrar(pedido);

	}

}
