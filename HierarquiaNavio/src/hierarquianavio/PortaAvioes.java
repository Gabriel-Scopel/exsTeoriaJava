/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hierarquianavio;

/**
 *
 * @author Gabriel Scopel
 */
public class PortaAvioes extends NavioDeGuerra{
    private int numeroAvioes;

    public PortaAvioes(int numeroAvioes, double blindagem, double ataque, int tripulantes, String nome) {
        super(blindagem, ataque, tripulantes, nome);
        this.numeroAvioes = numeroAvioes;
    }

    public int getNumeroAvioes() {
        return numeroAvioes;
    }
    
    public void poderDeFogo(){
        System.out.println(this.numeroAvioes*this.numeroAvioes);
    }
}
