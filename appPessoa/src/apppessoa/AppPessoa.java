/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apppessoa;
import java.util.Scanner;
/**
 *
 * @author Gabriel Scopel
 */
public class AppPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); 
        System.out.println("Digite o nome: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o cpf: ");
        Scanner inputCpf = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        Scanner inputIdade = new Scanner(System.in);
        p1.setNome(input.nextLine());
        p1.setCpf(inputCpf.nextLine());
        p1.setIdade(inputIdade.nextInt());
        System.out.println("Nome digitado: "+p1.getNome());
        System.out.println("Cpf digitado: "+p1.getCpf());
        System.out.println("Idade digitada: "+p1.getIdade());
        
        
        Pessoa p2 = new Pessoa(); 
        System.out.println("Digite o nome: ");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite o cpf: ");
        Scanner inputCpf2 = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        Scanner inputIdade2 = new Scanner(System.in);
        p2.setNome(input2.nextLine());
        p2.setCpf(inputCpf2.nextLine());
        p2.setIdade(inputIdade2.nextInt());
        System.out.println("Nome digitado: "+p2.getNome());
        System.out.println("Cpf digitado: "+p2.getCpf());
        System.out.println("Idade digitada: "+p2.getIdade());
        
        Pessoa p3 = new Pessoa(); 
        System.out.println("Digite o nome: ");
        Scanner input3 = new Scanner(System.in);
        System.out.println("Digite o cpf: ");
        Scanner inputCpf3 = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        Scanner inputIdade3 = new Scanner(System.in);
        p3.setNome(input3.nextLine());
        p3.setCpf(inputCpf3.nextLine());
        p3.setIdade(inputIdade3.nextInt());
        System.out.println("Nome digitado: "+p3.getNome());
        System.out.println("Cpf digitado: "+p3.getCpf());
        System.out.println("Idade digitada: "+p3.getIdade());
        
    }
    
}
