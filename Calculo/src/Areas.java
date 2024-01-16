
import java.util.Scanner;

/**
 *
 * @author Juan Pedro.
   @Adnan Hamidoun
 */
public class Areas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(areaCuadrado(sc));
        System.out.println(areaPentagono(sc));
        System.out.println(areaTrapecio(sc));
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
    public static double areaTrapecio(Scanner sc){
        System.out.println("Base Mayor: ");
        double a  = Double.parseDouble(sc.nextLine());
        System.out.println("Base menor: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Altura");
        double c = Double.parseDouble(sc.nextLine());
        return (a+b)/2 * c;

    }
}
