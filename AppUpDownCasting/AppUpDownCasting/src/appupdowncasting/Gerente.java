/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appupdowncasting;

/**
 *
 * @author osjunior
 */
public class Gerente extends Funcionario {

    @Override
    public void batePonto() {
        System.out.println("Gerente entrou...");
    }

    public void demite() {
        System.out.println("Demitindo...");
    }
}
