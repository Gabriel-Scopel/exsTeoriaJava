public class Pessoa {
    private String nome;
    private String endereco;
    private double renda;
    private java.util.Date data;
    private ContaComum conta; //propriedade conta é do tipo ContaComum (objeto)

    public void setConta(ContaComum conta) {
        this.conta = conta;
    }

    public ContaComum getConta() {
        return this.conta;
    }
}
