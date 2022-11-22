package apparquivosregistro;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author osjunior
 */
public class AppArquivosRegistro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Arquivo banco = new Arquivo("banco.txt");
            banco.salvaRegistro(new Registro("João", "Pereira", OperacaoBancaria.Depósito, 1000.0));
            banco.salvaRegistro(new Registro("João", "Pereira", OperacaoBancaria.Saque, 100.0));
            banco.salvaRegistro(new Registro("Maria", "Silva", OperacaoBancaria.Saque, 500.0));
            banco.salvaRegistro(new Registro("Carlos", "Oliveira", OperacaoBancaria.Transferência, 300.0));

            ArrayList<Registro> registros = banco.leRegistros();
            for (Registro reg : registros) {
                System.out.println(reg);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
