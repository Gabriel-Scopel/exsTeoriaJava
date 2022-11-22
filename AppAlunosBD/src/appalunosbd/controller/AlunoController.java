package appalunosbd.controller;

import appalunosbd.dal.AlunoDAO;
import appalunosbd.model.Aluno;
import appalunosbd.view.FrmPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author osjunior
 */
public class AlunoController {

    private FrmPrincipal form;

    public AlunoController(FrmPrincipal form) {
        this.form = form;
    }

    public void listaAlunos() {
        try {
            AlunoDAO alunoDao = new AlunoDAO();
            ArrayList<Aluno> alunos = alunoDao.consulta();

            String[] colunas = {"Matrícula", "Nome", "Usuário", "Senha"};
            DefaultTableModel tableModel = new DefaultTableModel(colunas, 0);
            for (Aluno a : alunos) {
                Object[] data = {a.getMatricula(), a.getNome(), a.getUsuario(), a.getSenha()};
                tableModel.addRow(data);
            }
            form.getTbAlunos().setModel(tableModel);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, ex.getMessage());
        }
    }

}
