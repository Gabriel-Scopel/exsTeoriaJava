/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appanimalpolimorfico;

/**
 *
 * @author osjunior
 */
public class Passaro extends Animal {

    @Override
    public void move() {
        System.out.println("Voa");
    }

    @Override
    public void fala() {
        System.out.println("Piu Piu");
    }

}
