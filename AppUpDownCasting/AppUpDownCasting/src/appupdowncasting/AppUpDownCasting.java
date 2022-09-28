package appupdowncasting;

import java.util.ArrayList;

/**
 *
 * @author osjunior
 */
public class AppUpDownCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Upcasting
        Funcionario f1 = new Gerente();
        Funcionario f2 = new Analista();

        f1.batePonto();
        f2.batePonto();

        // Downcasting
        Gerente g = (Gerente) f1;
        Analista a = (Analista) f2;

        g.batePonto();
        g.demite();
        a.batePonto();

        // Lista de funcionários
        ArrayList<Funcionario> listaFunc = new ArrayList<>();
        listaFunc.add(f1);
        listaFunc.add(f2);
        listaFunc.add(g);
        listaFunc.add(a);

        for (var f : listaFunc) {
            //((Gerente)f).demite(); // casting - não funciona
            f.batePonto();
        }

        ((Gerente) listaFunc.get(0)).demite();
        // ((Gerente) ((Funcionario) a)).demite(); // não funciona
    }
}
