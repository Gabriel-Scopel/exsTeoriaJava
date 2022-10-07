/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xadrez;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
/**
 *
 * @author Gabriel Scopel
 */
public class Xadrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String tipo;
       String cor;
       String posicao;
       String peca;
       
       ArrayList <peca> pecas = new ArrayList<>();
       
       for(int i=0; i<2; i++){
           System.err.println("Digite o tipo: ");
       Scanner inputTipo = new Scanner(System.in);
       tipo = inputTipo.nextLine();
       
       System.err.println("Digite a cor: ");
       Scanner inputCor = new Scanner(System.in);
       cor = inputCor.nextLine();

       System.err.println("Digite a posicao: ");
       Scanner inputPosicao = new Scanner(System.in);
       posicao = inputPosicao.nextLine();
       
       pecas.add(new peca(tipo, cor, posicao));
           
       }
       
       System.err.println("Digite a posição da peça que você deseja remover: ");
       Scanner inputpeca = new Scanner(System.in);
       peca = inputpeca.nextLine();
       
       Iterator <peca> itr = pecas.iterator();
       
       
       
       
       for(int i=0; i<2; i++){
           System.out.println(pecas.get(i).getTipo());
           System.out.println(pecas.get(i).getCor());
           System.out.println(pecas.get(i).getPosicao());
           System.out.println();
           
       }
       
       
       
       
       
       
       
       
    }
    
}
