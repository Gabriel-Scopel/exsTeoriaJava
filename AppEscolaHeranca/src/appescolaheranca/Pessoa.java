/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appescolaheranca;

/**
 *
 * @author Gabriel Scopel
 */
public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public int getIdade() {
        return this.idade;
    }  
    
}
