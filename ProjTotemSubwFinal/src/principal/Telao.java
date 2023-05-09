package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import principal.util.Prompt;

public class Telao {
	public static void main(String[] args) throws FileNotFoundException {
        File arquivo = new File("dados.arq");
        Scanner leitor = new Scanner(arquivo);

        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            String[] dadosPedido = linha.split(":");

            System.out.println("Nome: " + dadosPedido[0]);
            System.out.println("Código do pedido: " + dadosPedido[1]);
            Prompt.separador();
        }

        leitor.close();
    }
}