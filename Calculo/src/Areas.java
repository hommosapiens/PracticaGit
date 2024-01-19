
import java.util.Scanner;

/**
 *
 * @author Juan Pedro.
 * @Adnan Hamidoun
 * @Mario García
 * @Santiago Pastor
 */
public class Areas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        do {
            menu = menu(sc);
            if (menu.equalsIgnoreCase("1")) {
                System.out.println("El área del cuadrado es: " + areaCuadrado(sc));
            } else if (menu.equalsIgnoreCase("2")) {
                System.out.println("El área del pentágono es: " + areaPentagono(sc));
            } else if (menu.equalsIgnoreCase("3")) {
                System.out.println("El área del trapecio es: " + areaTrapecio(sc));
            } else if (menu.equalsIgnoreCase("4")) {
                System.out.println("El área del círculo es: " + areaCirculo(sc));
            } else if (!(menu.equalsIgnoreCase("1") || menu.equalsIgnoreCase("2")
                    || menu.equalsIgnoreCase("3") || menu.equalsIgnoreCase("4") || menu.equalsIgnoreCase("5"))) {
                System.out.println("Introduce una opción válida por favor, gracias por las molestias");
            }
        } while (!menu.equalsIgnoreCase("5"));
        System.out.println("Un placer, disfrutra de tu dia :) ");
        System.out.println("ADIÓS!!!");

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

    public static double areaTrapecio(Scanner sc) {
        System.out.println("Base Mayor: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Base menor: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Altura");
        double c = Double.parseDouble(sc.nextLine());
        return (a + b) / 2 * c;
    }

    public static double areaCirculo(Scanner sc) {
        System.out.print("Radio: ");
        double radio = Double.parseDouble(sc.nextLine());
        return Math.PI * Math.pow(radio, 2);
    }

    public static String menu(Scanner sc) {
        String opcion;
        System.out.println("-------MENÚ DE OPCIONES-------");
        System.out.println("1. Calcular área de cuadrado");
        System.out.println("2. Calcular área de pentágono");
        System.out.println("3. Calcular área de trapecio");
        System.out.println("4. Calcular área de cuadrado");
        System.out.println("5. Salir");
        System.out.print("Introduce una opción: ");
        opcion = sc.nextLine();
        return opcion;
    }
}
