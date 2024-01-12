
import java.util.Scanner;

/**
 *
 * @author Juan Pedro.
 */
public class Areas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(areaCuadrado(sc.nextInt()));
        System.out.print("Perímetro: ");
        double p = Double.parseDouble(sc.nextLine());
        System.out.print("Apotema: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println(areaPentagono(p,a));
    }

    public static double areaCuadrado(double a) {
        return Math.pow(a, a);
    }
    
    public static double areaPentagono(double p, double a){
        return (p*a)/2;
    }
}
