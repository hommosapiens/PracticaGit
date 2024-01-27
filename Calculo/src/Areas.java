
import java.util.Scanner;

/**
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

            switch (menu) {
                case "1" ->
                    System.out.println("El área del cuadrado es: " + areaCuadrado(sc));
                case "2" ->
                    System.out.println("El área del pentágono es: " + areaPentagono(sc));
                case "3" ->
                    System.out.println("El área del trapecio es: " + areaTrapecio(sc));
                case "4" ->
                    System.out.println("El área del círculo es: " + areaCirculo(sc));
            }

        } while (!menu.equalsIgnoreCase("5"));
        System.out.println("Un placer, disfrute de su día :)");
        System.out.println("ADIÓS!!!");

    }

    public static String menu(Scanner sc) {
        String opcion;
        System.out.println();
        System.out.println("-------MENÚ DE OPCIONES-------");
        System.out.println("1. Calcular área de cuadrado");
        System.out.println("2. Calcular área de pentágono");
        System.out.println("3. Calcular área de trapecio");
        System.out.println("4. Calcular área de cuadrado");
        System.out.println("5. Salir");
        System.out.print("Introduce una opción: ");

        do {
            opcion = sc.nextLine();
            if (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3") && !opcion.equals("4") && !opcion.equals("5")) {
                System.out.print("Por favor introduzca una opción válida: ");
            }
        } while (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3") && !opcion.equals("4") && !opcion.equals("5"));

        return opcion;
    }

    public static double areaCuadrado(Scanner sc) {
        System.out.println();
        System.out.println("-----ÁREA CUADRADO-----");
        System.out.print("Introduzca la longitud del lado: ");
        Double a = 0.0;
        boolean success = false;
        do {
            try {
                a = Double.parseDouble(sc.nextLine());
                success = true;
            } catch (Exception e) {
                System.out.print("Por favor introduzca un valor válido: ");
            }
        } while (!success);
        return Math.pow(a, 2);
    }

    public static double areaPentagono(Scanner sc) {
        System.out.println();
        System.out.println("-----ÁREA PENTÁGONO-----");
        
        System.out.print("Perímetro: ");
        double p = 0.0;
        boolean proceso1 = false;
        
        do {
            try {
                p = Double.parseDouble(sc.nextLine());
                proceso1 = true;
            } catch (Exception e) {
                System.out.print("Por favor introduzca un número: ");
            }
        } while (!proceso1);
        
        System.out.print("Apotema: ");
        double a = 0.0;
        boolean proceso2 = false;
        
        do {
            try {
                a = Double.parseDouble(sc.nextLine());
                proceso2 = true;
            } catch (Exception e) {
                System.out.print("Por favor introduzca un número: ");
            }
        } while (!proceso2);
        
        return (p * a) / 2;
    }

    public static double areaTrapecio(Scanner sc) {
        System.out.println();
        System.out.println("-----ÁREA TRAPECIO-----");
        System.out.print("Base Mayor: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Base menor: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Altura: ");
        double c = Double.parseDouble(sc.nextLine());
        return (a + b) / 2 * c;
    }

    public static double areaCirculo(Scanner sc) {
        System.out.println();
        System.out.println("-----ÁREA CÍRCULO-----");
        System.out.print("Radio: ");
        double radio = Double.parseDouble(sc.nextLine());
        return Math.PI * Math.pow(radio, 2);
    }

}
