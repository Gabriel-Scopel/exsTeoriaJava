/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package action;

import java.util.Random;
import newpackage.Formulario;

/**
 *
 * @author Gabriel Scopel
 */
public class Action {
    Formulario janela;
    Random gerador;
    
    public Action(Formulario janela) {
       this.janela = janela;
       this.gerador = new Random();
    }
    
   
    public void fuga(){
        janela.getBotao().setLocation(gerador.nextInt(janela.getWidth()), gerador.nextInt(janela.getHeight()));
        
    }
    
    
}
