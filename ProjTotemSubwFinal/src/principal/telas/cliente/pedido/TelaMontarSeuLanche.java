package principal.telas.cliente.pedido;

import java.io.FileNotFoundException;

import principal.Ingrediente;
import principal.Pedido;
import principal.telas.cliente.TelaCliente;
import principal.util.Prompt;

public class TelaMontarSeuLanche {

	public static void mostrar(Pedido pedido) throws FileNotFoundException {
		Prompt.separador();
		System.out.println("Vamos começar!!!");
		System.out.println("Voce deseja o seu lanche de: ");
		System.out.println("[1] 15cm");
		System.out.println("[2] 30cm   +R$11,00");
		int tamanhoLanche = Prompt.lerInteiro();

		switch (tamanhoLanche) {
		case 1:
			System.out.println("15 cm selecionado!");
			pedido.addIngrediente(new Ingrediente("15CM", 0));
			break;
		case 2:
			System.out.println("30 cm selecionado!");
			pedido.addIngrediente(new Ingrediente("30CM", 11));
			break;
	
		default: 
			System.out.println("Opção invalida!");
			TelaMontarSeuLanche.mostrar(pedido);
		}

		Prompt.separador();
		System.out.println("Selecione qual tipo de pão deseja");
		System.out.println("[1]Tres queijos");
		System.out.println("[2]Italiano Branco");
		System.out.println("[3]9 Graos");
		System.out.println("[4]Parmesao e oregano");
		System.out.println("[5]Voltar");

		int op = Prompt.lerInteiro();
		switch (op) {
		case 1:
			System.out.println("Pão Tres queijos foi selecionado!");
			pedido.addIngrediente(new Ingrediente("Pão Tres queijos", 0));
			break;

		case 2:
			System.out.println("Pão Italiano Branco foi selecionado!");
			pedido.addIngrediente(new Ingrediente("Pão Italiano Branco", 0));
			break;

		case 3:
			System.out.println("Pão 9 Graos foi selecionado!");
			pedido.addIngrediente(new Ingrediente("Pão 9 Graos", 0));
			break;

		case 4:
			System.out.println("Pão Parmesao e oregano foi selecionado!");
			pedido.addIngrediente(new Ingrediente("Pão Parmesao e oregano", 0));
			break;

		case 5:
			pedido.removerIngrediente(0);
			System.out.println();
			TelaCliente.mostrarMenu();
			break;

		default:
			pedido.removerIngrediente(0);
			System.out.println("Opção não encontrada :(");
			System.out.println();
			TelaMontarSeuLanche.mostrar(pedido);
			break;
		}

		TelaCarne.mostrar(pedido);
	}

}
