/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemapolico;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriel Scopel
 */
public class SistemaPolico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Vereador> v1 = new ArrayList <>();
        ArrayList <Prefeito> p1 = new ArrayList <>();
  
        System.out.println("Vereador nome: ");
        Scanner inputNome = new Scanner(System.in);
        String nome = inputNome.nextLine();
        
        System.err.println("Vereador partido: ");
        Scanner inputPartido = new Scanner(System.in);
        String partido = inputPartido.nextLine();
        
        System.err.println("Vereador estado: ");
        Scanner inputEstado = new Scanner(System.in);
        String estado = inputEstado.nextLine();
        
        System.err.println("Vereador função: ");
        Scanner inputFuncao = new Scanner(System.in);
        String funcao = inputFuncao.nextLine();
        
        System.err.println("Vereador municipio: ");
        Scanner inputMunicipio = new Scanner(System.in);
        String municipio = inputMunicipio.nextLine();
        
        Vereador vereadorObj = new Vereador(nome, partido, estado, funcao, municipio);
        v1.add(vereadorObj);
        
        System.out.println("Prefeito nome: ");
        Scanner inputNomePref = new Scanner(System.in);
        String nomePref = inputNomePref.nextLine();
        
        System.err.println("Prefeito partido: ");
        Scanner inputPartidoPref = new Scanner(System.in);
        String partidoPref = inputPartidoPref.nextLine();
        
        System.err.println("Prefeito estado: ");
        Scanner inputEstadoPref = new Scanner(System.in);
        String estadoPref = inputEstadoPref.nextLine();
        
        System.err.println("Prefeito função: ");
        Scanner inputFuncaoPref = new Scanner(System.in);
        String funcaoPref = inputFuncaoPref.nextLine();
        
        System.err.println("Prefeito municipio: ");
        Scanner inputMunicipioPref = new Scanner(System.in);
        String municipioPref = inputMunicipioPref.nextLine();
        
        Prefeito PrefeitoObj = new Prefeito(nomePref, partidoPref, estadoPref, funcaoPref, municipioPref);
        p1.add(PrefeitoObj);
        
        for(int i=0; i<v1.size();i++){
            v1.get(i).Apresentacao();
        }
        System.out.println("");
        
        for(int i=0; i<p1.size();i++){
            p1.get(i).Apresentacao();
        }
        
        
        
        
        
    }
    
}
