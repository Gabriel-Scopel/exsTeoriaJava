package apparquivosregistro;

/**
 * Enumerador OperacaoBancaria.
 * Define as operações bancárias disponíveis.
 * @author osjunior
 */
public enum OperacaoBancaria {
    Saque("Saque"),
    Depósito("Depósito"),
    Transferência("Transferência");

    private final String descricao;

    OperacaoBancaria(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
