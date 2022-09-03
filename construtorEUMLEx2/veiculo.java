/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veiculo;

/**
 *
 * @author Gabriel Scopel
 */
public class Veiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        carro carro1 = new carro();
        carro carro2 = new carro("Porsche", "prata", 2011);
        carro carro3 = new carro("Porche", "prata", 2011, 300.0, 1542.0);
    }
    
}
