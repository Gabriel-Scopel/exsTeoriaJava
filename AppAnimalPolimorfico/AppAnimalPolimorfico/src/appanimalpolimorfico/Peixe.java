/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appanimalpolimorfico;

/**
 *
 * @author osjunior
 */
public class Peixe extends Animal {

    @Override
    public void move() {
        super.move();
        System.out.println("Nada");
    }

    @Override
    public void fala() {
        System.out.println("Glub glub");
    }
}
