
import java.util.Scanner;
/**
 *
 * @author Gabriel Scopel
 */
public class SwapperDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Swapper troca = new Swapper();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor para x:");
        troca.setX(input.nextFloat());
        System.out.println("Digite um valor para y:");
        troca.setY(input.nextFloat());
        troca.swap();
        System.out.println("X trocado: "+troca.getX());
        System.out.println("Y trocado: "+troca.getY());
    }
    
}
