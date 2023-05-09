package principal.telas.cliente.pedido;

import java.io.FileNotFoundException;

import principal.Ingrediente;
import principal.Pedido;
import principal.util.Prompt;

public class TelaCarne {

	public static void mostrar(Pedido pedido) throws FileNotFoundException {
		Prompt.separador();
		System.out.println("Qual tipo de carne deseja?");
		System.out.println("[1] Carne");
		System.out.println("[2] Frango");
		System.out.println("[3] Vegetariano");
		System.out.println("[4] Voltar");

		int op = Prompt.lerInteiro();
		switch (op) {
		case 1:
			Prompt.separador();
			System.out.println("Selecione a opcao que deseja: ");
			System.out.println("[1] Carne Defumada com Cream Cheese   R$23,00");
			System.out.println("[2] Carne Supreme                     R$25,00");
			System.out.println("[3] Steak Cheddar Cremoso             R$21,00");
			System.out.println("[4] Steak Churrasco                   R$19,00");
			System.out.println("[5] Voltar");
			op = Prompt.lerInteiro();
			switch (op) {
			case 1:
				System.out.println("Carne Defumada com Cream Cheese selecionada!");
				pedido.addIngrediente(new Ingrediente("Carne Defumada com Cream Cheese", 23.0));
				System.out.println();
				break;

			case 2:
				System.out.println("Carne Supreme selecionada!");
				pedido.addIngrediente(new Ingrediente("Carne Supreme", 25.0));
				System.out.println();
				break;

			case 3:
				System.out.println("Steak Cheddar Cremoso selecionada!");
				pedido.addIngrediente(new Ingrediente("Steak Cheddar Cremoso", 21.0));
				System.out.println();
				break;

			case 4:
				System.out.println("Steak Churrasco selecionada!");
				pedido.addIngrediente(new Ingrediente("Steak Churrasco", 19.0));
				System.out.println();
				break;

			case 5:
				TelaCarne.mostrar(pedido);
				break;

			default:
				System.out.println("Opção não encontrada :(");
				System.out.println();
				TelaCarne.mostrar(pedido);
				break;
			}
			break;

		case 2:
			Prompt.separador();
			System.out.println("Selecione a opcao que deseja: ");
			System.out.println("[1] Frango                             R$18,00");
			System.out.println("[2] Frango Defumado com Cream Cheese   R$22,00");
			System.out.println("[3] Frango Empanado                    R$18,00");
			System.out.println("[4] Teriyaki                           R$22,00");
			System.out.println("[5] Voltar");
			op = Prompt.lerInteiro();
			switch (op) {
			case 1:
				System.out.println("Frango selecionado!");
				pedido.addIngrediente(new Ingrediente("Frango", 18.0));
				System.out.println();
				break;

			case 2:
				System.out.println("Frango Defumado com Cream Cheese selecionado!");
				pedido.addIngrediente(new Ingrediente("Frango Defumado com Cream Cheese", 22.0));
				System.out.println();
				break;

			case 3:
				System.out.println("Frango Empanado selecionado!");
				pedido.addIngrediente(new Ingrediente("Frango Empanado", 18.0));
				System.out.println();
				break;

			case 4:
				System.out.println("Teriyaki selecionado!");
				pedido.addIngrediente(new Ingrediente("Teriyaki", 22.0));
				System.out.println();
				break;

			case 5:
				TelaCarne.mostrar(pedido);
				break;

			default:
				System.out.println("Opção não encontrada :(");
				System.out.println();
				TelaCarne.mostrar(pedido);
				break;
			}
			break;

		case 3:
			Prompt.separador();
			System.out.println("Selecione a opcao que deseja: ");
			System.out.println("[1] Teriyaki VEG   R$22,00");
			System.out.println("[2] Vegetariano    R$12,90");
			System.out.println("[3] Voltar");
			op = Prompt.lerInteiro();
			switch (op) {
			case 1:
				System.out.println("Teriyaki VEG selecionado!");
				pedido.addIngrediente(new Ingrediente("Teriyaki VEG", 22.0));
				System.out.println();
				break;

			case 2:
				System.out.println("Vegetariano selecionado!");
				pedido.addIngrediente(new Ingrediente("Vegetariano", 12.90));
				System.out.println();
				break;

			case 3:
				TelaCarne.mostrar(pedido);
				break;

			default:
				System.out.println("Opção não encontrada :(");
				System.out.println();
				TelaCarne.mostrar(pedido);
				break;
			}
			break;

		case 4:
			pedido.removerIngrediente(1);
			pedido.removerIngrediente(0);
			TelaMontarSeuLanche.mostrar(pedido);
			break;

		default:
			System.out.println("Opção não encontrada :(");
			System.out.println();
			TelaCarne.mostrar(pedido);
			break;

		}
		TelaQueijo.mostrar(pedido);
	}

}
