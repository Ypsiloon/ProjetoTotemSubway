package principal.telas.cliente;

import java.io.FileNotFoundException;

import principal.Pedido;
import principal.telas.cliente.pedido.TelaMontarSeuLanche;
import principal.util.Prompt;

public class TelaRemoverPedido {

	public static void escolherOpcao() throws FileNotFoundException {
		System.out.println("Qual opção deseja remover?");
		System.out.println("[1] Lanche");
		System.out.println("[2] Adicionais");
		System.out.println("[3] Bebida ");
		System.out.println("[4] Sobremesa ");
		System.out.println("[5] Voltar");

		int op = Prompt.lerInteiro();
		switch (op) {
		case 1:
			Pedido.ingredientes.clear();
			System.out.println("Lanche(s) Apagado(s)!");
			TelaCliente.mostrarMenu();
			break;
			
		case 2:
			Pedido.adicionais.clear();
			System.out.println("Adicionais(s) Apagado(s)!");
			TelaCliente.mostrarMenu();
			break;
			
		case 3:
			Pedido.bebidas.clear();
			System.out.println("Bebida(s) Apagada(s)!");
			TelaCliente.mostrarMenu();
			break;
		
		case 4:
			Pedido.sobremesas.clear();
			System.out.println("Sobremesa(s) Apagada(s)!");
			TelaCliente.mostrarMenu();
			break;
			
		case 5:
			TelaPedido.apresentarPedido();
			break;
		
		default: 
			System.out.println("Opção invalida!");
			TelaRemoverPedido.escolherOpcao();
		}

	}

}
