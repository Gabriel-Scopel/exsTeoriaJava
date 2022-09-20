/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appescolaheranca;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Gabriel Scopel
 */
public class AppEscolaHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Aluno> alunos = new ArrayList <> ();
        Scanner input = new Scanner(System.in);
        System.out.print("nome: ");
        String nome = input.nextLine();
        
        
        System.out.print("sobrenome: ");
        String sobrenome = input.nextLine();
        
        
        System.out.print("idade: ");
        int idade = input.nextInt();
        
        input.nextLine();
        
        System.out.print("curso: ");
        String curso = input.nextLine();
        
        Aluno objAluno = new Aluno(nome, sobrenome, idade, curso);
        alunos.add(objAluno);

        
        for(int i=0; i<alunos.size();i++){
            System.out.println("Nome: "+alunos.get(i).getNome());
            System.out.println("Sobrenome: "+alunos.get(i).getSobrenome());
            System.out.println("Idade: "+alunos.get(i).getIdade());
            System.out.println("Curso: "+alunos.get(i).getCurso());
        }
        
    }
    
}
