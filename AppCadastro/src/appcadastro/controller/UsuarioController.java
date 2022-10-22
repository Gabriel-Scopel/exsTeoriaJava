/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcadastro.controller;

import appcadastro.view.FrmUsuario;
import appcadastro.model.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author osjunior
 */
public class UsuarioController {

    private FrmUsuario janela;

    public UsuarioController(FrmUsuario view) {
        this.janela = view;
    }

    public void cadastraUsuario() {
        String nome = this.janela.getTxtNome().getText();
        String sobrenome = this.janela.getTxtSobrenome().getText();
        String email = this.janela.getTxtEmail().getText();
        int idade = Integer.valueOf(this.janela.getTxtIdade().getText());

        // Insere dados no banco de dados
        // Insere dados no arquivo
        Usuario usuario = new Usuario(nome, sobrenome, email, idade);
        if (usuario.cadastra()) {
            JOptionPane.showMessageDialog(janela, "OK!");
        }
    }
}
