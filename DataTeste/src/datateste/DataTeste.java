package datateste;

/**
 *
 * @author osjunior
 */
public class DataTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data hoje = new Data();
        hoje.setDia(27);
        hoje.setMes(8);
        hoje.setAno(2022);

        hoje.exibeData();
    }
}
