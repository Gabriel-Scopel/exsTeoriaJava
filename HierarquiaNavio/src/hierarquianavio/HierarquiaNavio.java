/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hierarquianavio;

import java.util.Scanner;

/**
 *
 * @author Gabriel Scopel
 */
public class HierarquiaNavio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Navio n1 = new Navio(10, "msg");
        NavioDeGuerra ndg = new NavioDeGuerra(200, 100, 120, "alacrity");
        NavioMercante nm = new NavioMercante(140, 220, 40, "alabama");
        PortaAvioes pa = new PortaAvioes(50, 30, 12, 34,"cleitin" );
        Cruzador c = new Cruzador(11, 3, 4, 55, "rod");
        n1.exibirInfoGeral();
        ndg.exibirArmas();
        ndg.poderDeFogo();
        nm.carregamento();
        pa.poderDeFogo();
        c.poderDeFogo();
        
        
    }
    
}
