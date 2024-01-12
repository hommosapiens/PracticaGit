
import java.util.Scanner;

/**
 *
 * @author Juan Pedro.
 */
public class Areas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(areaCuadrado(sc));
        System.out.println(areaPentagono(sc));
    }

    public static double areaCuadrado(Scanner sc) {
        System.out.println("Introduzca la longitud del lado");
        Double a = Double.parseDouble(sc.nextLine());
        return Math.pow(a, a);
    }

    public static double areaPentagono(Scanner sc) {
         System.out.print("Perímetro: ");
        double p = Double.parseDouble(sc.nextLine());
        System.out.print("Apotema: ");
        double a = Double.parseDouble(sc.nextLine());
        return (p * a) / 2;
    }
}
