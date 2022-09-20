/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appescolaheranca;

/**
 *
 * @author Gabriel Scopel
 */
public class Aluno extends Pessoa{
    private String curso;
    
    public Aluno(String nome, String sobrenome, int idade, String curso){
        super(nome, sobrenome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    /*public String toString(){
        return super.getNome() + " - " +this.getCurso();
    }    */
}
