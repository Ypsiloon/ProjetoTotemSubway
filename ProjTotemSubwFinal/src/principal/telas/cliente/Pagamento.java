package principal.telas.cliente;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import principal.telas.cliente.pedido.TelaMontarSeuLanche;
import principal.util.Prompt;

public class Pagamento {

	public static void escolherOpcao() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		String resp;

		System.out.println("Por qual nome deseja ser chamado?");
		resp = sc.nextLine();

		System.out.println(resp + " qual metodo de pagamento deseja?");
		System.out.println("[1] Cartão Credito");
		System.out.println("[2] Cartão Debito");
		System.out.println("[3] Pix");
		System.out.println("[4] Voltar");
		int op = Prompt.lerInteiro();

		switch (op) {
		case 1:
			System.out.println("Insira ou aproxime o cartão!");
			System.out.println("Digite sua senha: ");
			Prompt.pressionarEnter();
			System.out.println("Agradecemos pela preferencia :)");
			break;
		case 2:
			System.out.println("Insira ou aproxime o cartão!");
			System.out.println("Digite sua senha:");
			Prompt.pressionarEnter();
			System.out.println("Agradecemos pela preferencia :)");
			break;
		case 3:
			System.out.println("Copie o codigo ou leia o Qr code");
			System.out.println("Agradecemos pela preferencia :)");
			break;
		case 4:
			TelaPedido.apresentarPedido();
			break;
			
		default: 
			System.out.println("Opção invalida!");
			Pagamento.escolherOpcao();
		}
		int numeroAleatorio = gerador.nextInt(100) + 1;
		System.out.println("O codigo do seu pedido é: " + numeroAleatorio);
		System.out.println("Volte sempre!");
		try {
			EscreverArquivo escreverArquivo = new EscreverArquivo();
			escreverArquivo.escrever(resp, numeroAleatorio);
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.exit(1);
	}

}
