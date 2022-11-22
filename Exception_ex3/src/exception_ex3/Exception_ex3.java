/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception_ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gabriel Scopel
 */
public class Exception_ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = {0,0,0,0,0,0,0,0,0,0};
        int valor=1;
        
        int total=0;
        try {
            for(int i=0; i<10; i++){
                Scanner input = new Scanner(System.in);
            while(valor != 0){
                System.out.println("entrou");
                valor = input.nextInt();
                vetor[i] = valor;
                total+=valor;
                i++;
             }
            
            }
        

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        finally{
            System.out.println("soma: "+ total);
        }
    }
    
}
