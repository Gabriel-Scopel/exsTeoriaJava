/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appanimalpolimorfico;

import java.util.ArrayList;

/**
 *
 * @author osjunior
 */
public class AppAnimalPolimorfico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Peixe());
        animais.add(new Sapo());
        animais.add(new Passaro());

        for (var animal : animais) {
            animal.move();
            animal.fala();
        }

        Animal meuAnimal = new Peixe();
        meuAnimal.move();
    }
}
