/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcopadomundo;

/**
 * Classe Jogador. Reúne informações do jogador da seleção.
 *
 * @author Orlando Junior
 * @version 1.0
 */
public class Jogador {

    private String nome;
    private String posicao;
    private int numero;

    /**
     * Instancia um objeto Jogador.
     *
     * @param nome. Nome do jogador da seleção.
     * @param posicao. Posição do jogador (goleiro, zagueiro, meio de campo ou
     * atacante).
     * @param numero. Número da camisa do jogador (1 - 99).
     */
    public Jogador(String nome, String posicao, int numero) {
        this.nome = nome;
        this.posicao = posicao;
        this.numero = numero;
    }

    /**
     * Recupera o nome do jogador.
     * @return nome do jogador.
     */
    public String getNome() {
        return this.nome;
    }
}
