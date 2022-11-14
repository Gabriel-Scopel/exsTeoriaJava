package appeventos.controller;

import appeventos.view.FrmPrincipal;
import java.awt.Color;

/**
 *
 * @author orlandojunior
 */
public class EventosController {

    private FrmPrincipal janela;

    public EventosController(FrmPrincipal janela) {
        this.janela = janela;
    }

    private void atualizaTexto(String texto) {
        String atual = janela.getTxtTexto().getText();
        String novo = atual + texto;
        janela.getTxtTexto().setText(novo);
    }

    public void botaoA() {
        this.atualizaTexto("A");
    }

    public void botaoB() {
        this.atualizaTexto("B");
    }

    public void limpaBotoes() {
        janela.getBtnA().setBackground(Color.WHITE);
        janela.getBtnB().setBackground(Color.WHITE);
    }
}
