/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xadrez;

/**
 *
 * @author Gabriel Scopel
 */
public class peca {
    private String tipo;
    private String cor;
    private String posicao;

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getPosicao() {
        return posicao;
    }

    public peca(String tipo, String cor, String posicao) {
        this.tipo = tipo;
        this.cor = cor;
        this.posicao = posicao;
    }
}
