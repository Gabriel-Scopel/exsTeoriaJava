/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Scopel
 */
public class Cadastra {
    public void registra(String nome, String sobrenome, int idade, String cpf, char sexo){
        try {

            FileWriter arq = new FileWriter("cadastrados.txt", true);
            PrintWriter escrita = new PrintWriter(arq);
            escrita.println(nome +" "+ sobrenome +" "+ idade +" "+ sexo +" "+ cpf);
            arq.close();
        } catch (Exception e) {
        }
    }
    public String busca(String cpf){
        try {
             FileReader arq = new FileReader("cadastrados.txt");
             BufferedReader br = new BufferedReader(arq);
             ArrayList <String> lista = new ArrayList<>();
             String str;
             String erro = "usuário não encontrado";
             while((str=br.readLine()) != null){
                 String[] vetor = str.split(" ");
                 if(vetor[4]==cpf){
                     return str;
                 }
                 else{
                     return erro;
                 }
                
             }
             
             
        } catch (Exception e) {
        }
        return null;
    }
}
