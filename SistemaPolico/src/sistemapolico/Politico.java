/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapolico;

/**
 *
 * @author Gabriel Scopel
 */
public class Politico {
    protected String nome;
    protected String partido;
    protected String estado;
    protected String funcao;

    public Politico(String nome, String partido, String estado, String funcao) {
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public String getEstado() {
        return estado;
    }

    public String getFuncao() {
        return funcao;
    }
    
    public void Apresentacao(){
        System.out.println(this.nome);
        System.out.println(this.partido);
        System.out.println(this.estado);
        System.out.println(this.funcao);
    }
}
