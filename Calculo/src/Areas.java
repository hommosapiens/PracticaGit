
import java.util.Scanner;

/**
 *
 * @author Juan Pedro.
 */
public class Areas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(areaCuadrado(sc.nextInt()));
    }

    public static double areaCuadrado(double a) {
        return Math.pow(a, a);
    }
}
