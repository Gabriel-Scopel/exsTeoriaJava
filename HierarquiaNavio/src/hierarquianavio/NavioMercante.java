/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hierarquianavio;

/**
 *
 * @author Gabriel Scopel
 */
public class NavioMercante extends Navio{
    private double carga;
    private double capacidadeDeCarga;

    public NavioMercante(double carga, double capacidadeDeCarga, int tripulantes, String nome) {
        super(tripulantes, nome);
        this.carga = carga;
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public double getCarga() {
        return carga;
    }

    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }
    public void carregamento(){
        System.out.println(this.carga);
        System.out.println(this.capacidadeDeCarga);
    }
}
