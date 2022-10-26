/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appsomamvc.controller;

import appsomamvc.model.CalculadoraSoma;
import appsomamvc.view.FrmPrincipal;

/**
 *
 * @author osjunior
 */
public class CalculadoraSomaController {

    private CalculadoraSoma calculadora;
    private FrmPrincipal janela;

    public CalculadoraSomaController(FrmPrincipal janela) {
        this.janela = janela;
        this.calculadora = new CalculadoraSoma();
    }

    public void calculaSoma() {
        // View
        int numero1 = Integer.valueOf(janela.getTxtNumero1().getText());
        int numero2 = Integer.valueOf(janela.getTxtNumero2().getText());
        // Model
        int resultado = calculadora.soma(numero1, numero2);
        // View
        janela.getTxtResultado().setText(String.valueOf(resultado));
        
    }

}
