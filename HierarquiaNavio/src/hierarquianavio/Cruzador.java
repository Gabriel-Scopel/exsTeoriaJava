/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hierarquianavio;
import java.lang.Math;
/**
 *
 * @author Gabriel Scopel
 */
public class Cruzador extends NavioDeGuerra {
    private int numeroDeCanhoes;

    public Cruzador(int numeroDeCanhoes, double blindagem, double ataque, int tripulantes, String nome) {
        super(blindagem, ataque, tripulantes, nome);
        this.numeroDeCanhoes = numeroDeCanhoes;
    }

    public int getNumeroDeCanhoes() {
        return numeroDeCanhoes;
    }

    public void poderDeFogo(){
        System.out.println(Math.sqrt(this.numeroDeCanhoes));
    }

    

    
    
}
