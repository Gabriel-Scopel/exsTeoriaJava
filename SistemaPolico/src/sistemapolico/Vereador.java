/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapolico;

/**
 *
 * @author Gabriel Scopel
 */
public class Vereador extends Politico {
    private String municipio;
    public Vereador(String nome, String partido, String estado, String funcao, String municipio) {
        super(nome, partido, estado, funcao);
        this.municipio = municipio;
    }
    public void Apresentacao(){
        System.err.println(super.getNome());
        System.err.println(super.getPartido());
        System.err.println(super.getEstado());
        System.err.println(super.getFuncao());
        System.err.println(this.municipio);  
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
}
