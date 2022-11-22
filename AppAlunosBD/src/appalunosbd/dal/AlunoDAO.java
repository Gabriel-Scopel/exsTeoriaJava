package appalunosbd.dal;

import appalunosbd.model.Aluno;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author osjunior
 */
public class AlunoDAO implements IDAO<Aluno> {

    private Conexao conn;

    public AlunoDAO() throws Exception {
        this.conn = Conexao.getConexao();
    }

    @Override
    public ArrayList<Aluno> consulta() throws SQLException {
        ArrayList<Aluno> alunos = new ArrayList<>();

        String sql = "SELECT matricula, nome, usuario, senha FROM alunos;";
        PreparedStatement ps = this.conn.getDriver().prepareStatement(sql);
        ps.execute();
        ResultSet rs = ps.getResultSet();

        while (rs.next()) {
            Aluno objAluno = new Aluno();
            objAluno.setMatricula(rs.getInt("matricula"));
            objAluno.setNome(rs.getString("nome"));
            objAluno.setUsuario(rs.getString("usuario"));
            objAluno.setSenha(rs.getString("senha"));
            alunos.add(objAluno);
        }

        return alunos;
    }

    @Override
    public Aluno consulta(int id) throws SQLException {
        return null;
    }

    @Override
    public boolean insere(Aluno o) throws SQLException {
        String sql = "INSERT INTO alunos (matricula, nome, usuario, senha) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = this.conn.getDriver().prepareStatement(sql);
        ps.setInt(1, o.getMatricula());
        ps.setString(2, o.getNome());
        ps.setString(3, o.getUsuario());
        ps.setString(4, o.getSenha());
        return ps.execute();
    }

    @Override
    public boolean altera(Aluno o) throws SQLException {
        return true;
    }

    @Override
    public boolean apaga(Aluno o) throws SQLException {
        return true;
    }

}
