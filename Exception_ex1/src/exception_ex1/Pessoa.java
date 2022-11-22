/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception_ex1;

/**
 *
 * @author Gabriel Scopel
 */
public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;
    public String cpf;

    public Pessoa(String nome, String sobrenome, int idade, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
        if(cpf.contains("-") || cpf.contains(".")){
            throw new Exception("n deve conter hifer ou ponto");
        }
    }
    
}
