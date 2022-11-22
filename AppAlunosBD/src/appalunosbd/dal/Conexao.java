package appalunosbd.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author osjunior
 */
public class Conexao {

    private static Conexao conn;
    private Connection driver;

    public Conexao() throws SQLException {
        this.criaConexao();
    }

    public static Conexao getConexao() throws SQLException {
        if (conn == null) {
            conn = new Conexao();
        }
        return conn;
    }

    private void criaConexao() throws SQLException {
        this.driver = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "fei");
    }

    public Connection getDriver() {
        return driver;
    }
}
