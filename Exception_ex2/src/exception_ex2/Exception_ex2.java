/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception_ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gabriel Scopel
 */
public class Exception_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero;
        double total=0;
        double n=0;
        try {
            for(int i=0;i<100;i++){
                if(n<3){
            
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o valor de n: ");
            numero = input.nextDouble();
            n++;
            total+=numero;
            System.out.println("numero: "+numero);
            System.out.println("média: "+(total/n));
            }
              else{
              throw new Exception("ACIMA DE CEM");
            }
            
            
        }
            
        } catch (InputMismatchException e) {
            System.out.println("entre com os valores");
        }
    }
    
}
