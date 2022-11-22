package appalunosbd.model;

/**
 *
 * @author osjunior
 */
public class Aluno {

    private int matricula;
    private String nome;
    private String usuario;
    private String senha;

    public Aluno() {
    }

    public Aluno(int matricula, String nome, String usuario, String senha) {
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setUsuario(usuario);
        this.setSenha(senha);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public String toString(){
        return String.format("%d\t%s", this.getMatricula(), this.nome);
    }

}
