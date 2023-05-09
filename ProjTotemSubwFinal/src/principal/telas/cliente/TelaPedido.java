package principal.telas.cliente;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import principal.Ingrediente;
import principal.Pedido;
import principal.telas.cliente.pedido.TelaMontarSeuLanche;
import principal.util.Prompt;

public class TelaPedido {

	public static void mostrarLanche(Pedido pedido) throws FileNotFoundException {
		System.out.println("Ingredientes selecionados: ");
		for (Ingrediente i : pedido.getIngredientes()) {
			System.out.println("- " + i.getNome());
		}

		for (Ingrediente i : pedido.getAdicionais()) {
			System.out.println("- " + i.getNome());
		}
		System.out.println("Preço total: R$" + (pedido.getPrecoTotal() + pedido.getPrecoTotalAdicionais()));
	}

	public static void mostrarBebida(Pedido pedidoBebida) {

		System.out.println("Bebidas selecionadas: ");
		for (Ingrediente i : pedidoBebida.getBebida()) {
			System.out.println("- " + i.getNome());
		}

		System.out.println("Preço total: R$" + pedidoBebida.getPrecoTotalBebida());

	}

	public static void mostrarSobremesa(Pedido pedidoSobremesa) {

		System.out.println("Sobremesa selecionadas: ");
		for (Ingrediente i : pedidoSobremesa.getSobremesa()) {
			System.out.println("- " + i.getNome());
		}

		System.out.println("Preço total: R$" + pedidoSobremesa.getPrecoTotalSobremesa());

	}

	public static void apresentarPedido() throws FileNotFoundException{
		double somaTotal = 0;

		System.out.println("Seu pedido final ficou");
		if (Pedido.getPrecoTotal() != 0) {
			System.out.println("Lanche: ");
			for (Ingrediente i : Pedido.getIngredientes()) {
				System.out.println("- " + i.getNome());
			}
			System.out.println("Preço total: R$" + Pedido.getPrecoTotal());

			Prompt.separador();

		}
		if (Pedido.getPrecoTotalAdicionais() != 0) {
			System.out.println("Adicionais: ");
			for (Ingrediente i : Pedido.getAdicionais()) {
				System.out.println("- " + i.getNome());
			}
			System.out.println("Preço total: R$" + Pedido.getPrecoTotalAdicionais());

			Prompt.separador();

		}
		if (Pedido.getPrecoTotalBebida() != 0) {
			System.out.println("Bebida: ");
			for (Ingrediente i : Pedido.getBebida()) {
				System.out.println("- " + i.getNome());
			}
			System.out.println("Preço total: R$" + Pedido.getPrecoTotalBebida());

			Prompt.separador();

		}
		if (Pedido.getPrecoTotalSobremesa() != 0) {
			System.out.println("Sobremesa: ");
			for (Ingrediente i : Pedido.getSobremesa()) {
				System.out.println("- " + i.getNome());
			}
			System.out.println("Preço total: R$" + Pedido.getPrecoTotalSobremesa());
			Prompt.separador();

		}

		somaTotal = Pedido.getPrecoTotal() + Pedido.getPrecoTotalBebida() + Pedido.getPrecoTotalSobremesa()
				+ Pedido.getPrecoTotalAdicionais();
		System.out.printf("Preço Total: R$ %.2f", somaTotal);

		System.out.println();
		Prompt.separador();

		System.out.println("Confirma seu pedido?");
		System.out.println("[1]Sim");
		System.out.println("[2]Não");
		System.out.println("[3]Voltar");
		int op = Prompt.lerInteiro();
		switch (op) {
		case 1:
			if (somaTotal == 0) {
				System.out.println("Selecione ao menos um item.");
				TelaCliente.mostrarMenu();
			} else {
				Pagamento.escolherOpcao();
			}
			break;

		case 2:
			TelaRemoverPedido.escolherOpcao();
			break;

		case 3:
			TelaCliente.mostrarMenu();
			break;

		default:
			System.out.println("Opção invalida!");
			TelaPedido.apresentarPedido();
		}
	}
}