/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_ex1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Gabriel Scopel
 */
public class Arraylist_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> cores1 = new ArrayList<>();
        ArrayList <String> cores2 = new ArrayList<>();
        
        cores1.add("azul");
        cores1.add("amarelo");
        cores1.add("vermelho");
        cores2.add("azul");
        cores2.add("violeta");
        
        //método contains
        for(String cor: cores1){
        System.out.printf("%s exista na lista 2? --> %s", cor,cores2.contains(cor));
        System.out.println("");
        }
        
        
        
    }
    
}
