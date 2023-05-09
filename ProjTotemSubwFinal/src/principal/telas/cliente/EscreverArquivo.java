package principal.telas.cliente;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;
public class EscreverArquivo {
	
    private FileWriter arquivo;
    private BufferedWriter buffer;

    public EscreverArquivo() throws IOException {
        arquivo = new FileWriter("dados.arq", true);
        buffer = new BufferedWriter(arquivo);
    }

    public void escrever(String texto, int codigo) throws IOException {
        buffer.write(texto);
        buffer.write(":"+ codigo);
        buffer.newLine();
        buffer.flush();
    }

    public void fechar() throws IOException {
        buffer.close();
        arquivo.close();
    }
	
}

