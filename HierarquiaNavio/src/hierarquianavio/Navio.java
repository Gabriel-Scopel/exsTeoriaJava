/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hierarquianavio;

/**
 *
 * @author Gabriel Scopel
 */
public class Navio {
    private int tripulantes;
    private String nome;

    public Navio(int tripulantes, String nome) {
        this.tripulantes = tripulantes;
        this.nome = nome;
    }

    public int getTripulantes() {
        return tripulantes;
    }

    public String getNome() {
        return nome;
    }
 
    public void exibirInfoGeral(){
        System.out.println(this.nome + "_" + this.tripulantes);
    }
    
}
