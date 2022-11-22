package datateste;

/**
 *
 * @author osjunior
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return this.dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return this.mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }
    
    public void exibeData(){
        System.out.printf("%d/%d/%d", this.dia, this.getMes(), this.ano);
        System.out.println();
    }
}
