/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Cadastra;
import view.Janela;
import view.ProcuraUsuario;
/**
 *
 * @author Gabriel Scopel
 */
public class Controller {
    Janela j;
    ProcuraUsuario p;
    Cadastra c;
    public Controller(Janela j) {
        this.j = j;
        this.c = new Cadastra();
    }
    public Controller(ProcuraUsuario p) {
        this.p = p;
        this.c = new Cadastra();
    }
    
    
    public void registrar(){
        String nome = j.getTxtNome().getText();
        String sobrenome = j.getTxtSobrenome().getText();
        int idade = Integer.valueOf(j.getTxtIdade().getText());
        String cpf = j.getTxtCPF().getText();
        boolean sexoMasc = j.getjCheckBox1().isSelected();
        char sexo = sexoMasc ?  'M' : 'F';
        c.registra(nome, sobrenome, idade, cpf, sexo);
    }
    public void buscar(){
        String cpf = p.getTxtBuscaCpf().getText();
        p.getAreaTexto().setText(c.busca(cpf));
    }
    
    
    
    
}
