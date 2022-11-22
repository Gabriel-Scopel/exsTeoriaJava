package apparquivosregistro;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Classe Arquivo. Processa informações de Registro para um arquivo de texto.
 *
 * @author osjunior
 */
public class Arquivo {

    private String nomeArquivo;
    private ArrayList<Registro> registros;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.registros = new ArrayList<>();
    }

    public void salvaRegistro(Registro r) throws IOException {
        FileWriter arquivo = new FileWriter(this.nomeArquivo, true);
        PrintWriter escreve = new PrintWriter(arquivo);
        escreve.println(r);
        arquivo.close();
    }

    public ArrayList<Registro> leRegistros() throws IOException {
        FileReader arquivo = new FileReader(this.nomeArquivo);
        BufferedReader br = new BufferedReader(arquivo);

        String linha;
        while ((linha = br.readLine()) != null) {
            Registro reg = leRegistro(linha);
            this.registros.add(reg);
        }
        arquivo.close();
        return this.registros;
    }

    private Registro leRegistro(String linha) {
        String[] dados = linha.split("\\|");
        Registro reg = new Registro();
        reg.setNome(dados[0]);
        reg.setSobrenome(dados[1]);
        reg.setOperacao(OperacaoBancaria.valueOf(dados[2]));
        reg.setValor(Double.valueOf(dados[3].replace("R$", "").replace(".", "").replace(",", ".")));
        return reg;
    }
}
