public class ContaComum {
    private int numero;
    private java.util.Date data;
    private java.util.Date data_enc;
    private int situacao;
    private int senha;
    private double saldo;

    public ContaComum(){
        this.situacao = 1;
    }
    public void setNumero(int numero){
        this.numero = numero;;
    }
    public int getNumero(){
        return this.numero;
    }
}
