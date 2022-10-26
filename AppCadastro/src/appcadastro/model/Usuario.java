/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcadastro.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author osjunior
 */
public class Usuario {
    private String nome;
    private String sobrenome;
    private String email;
    private int idade;
    
    public Usuario(){}
    
    public Usuario(String nome, String sobrenome, String email, int idade){
        setNome(nome);
        setSobrenome(sobrenome);
        setEmail(email);
        setIdade(idade);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean cadastra() throws IOException {
        FileWriter arquivo = new FileWriter("cadastro.txt");
        PrintWriter escrivaArquivo = new PrintWriter(arquivo);
        return true;
    }
}
