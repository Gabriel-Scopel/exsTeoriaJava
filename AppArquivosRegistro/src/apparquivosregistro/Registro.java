package apparquivosregistro;

/**
 * Classe Registro. Registra as operações bancárias.
 *
 * @author osjunior
 */
public final class Registro {

    private String nome;
    private String sobrenome;
    private OperacaoBancaria operacao;
    private double valor;

    public Registro() {
    }

    public Registro(String nome, String sobrenome, OperacaoBancaria operacao, double valor) {
        setNome(nome);
        setSobrenome(sobrenome);
        setOperacao(operacao);
        setValor(valor);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public OperacaoBancaria getOperacao() {
        return operacao;
    }

    public void setOperacao(OperacaoBancaria operacao) {
        this.operacao = operacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%s|%s|%s|R$%,.2f", getNome(), getSobrenome(), getOperacao(), getValor());
    }
}
