/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hierarquianavio;

/**
 *
 * @author Gabriel Scopel
 */
public class NavioDeGuerra extends Navio {
    private double blindagem;
    private double ataque;

    public NavioDeGuerra(double blindagem, double ataque, int tripulantes, String nome) {
        super(tripulantes, nome);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

   

    public double getBlindagem() {
        return blindagem;
    }

    public double getAtaque() {
        return ataque;
    }
    public void exibirArmas(){
        System.out.println(super.getTripulantes());
        System.out.println(super.getNome());
        poderDeFogo();
    }
    
    public void poderDeFogo(){
        System.out.println(this.ataque);
    }
    
}
