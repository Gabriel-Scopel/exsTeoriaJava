/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception_ex1;

/**
 *
 * @author Gabriel Scopel
 */
public class Exception_ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Pessoa p = new Pessoa("gabriel", "scopel", 20, "2.2-2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
