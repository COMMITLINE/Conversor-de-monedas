import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        int seleccion;

        SelectorMonedaMenu selectorMonedaMenu = new SelectorMonedaMenu();

        while (!salida) {
            System.out.println("----Conversor de monedas----");

            System.out.println("Indica tu moneda principal o presiona 0 para salir: ");
            System.out.println("");
            System.out.println("1- USD Dolar." +
                    "\n2- CLP Peso Chileno." +
                    "\n3- EUR Euro" +
                    "\n4 -ARS Peso Argentino" +
                    "\n5 -BRL Real Brasileño");
            System.out.println("");

            seleccion = sc.nextInt();
            sc.nextLine();  // Consumir el salto de línea

            if (seleccion == 0) {
                salida = true;
                continue;
            }

            SelectorMonedaMenu selector = new SelectorMonedaMenu();
            selector.menuOperador(seleccion, sc);

            int otraConversion;
            while (true) {
                System.out.println("¿Deseas realizar otra conversión? Presiona 1 para hacer una nueva conversión, o presiona 0 para salir.");
                otraConversion = sc.nextInt();
                sc.nextLine();  // Consumir el salto de línea

                if (otraConversion == 0) {
                    salida = true;
                    break;
                } else if (otraConversion == 1) {
                    break;
                } else {
                    System.out.println("Entrada no válida. Presiona 1 para hacer otra conversión, o presiona 0 para salir.");
                }
            }
        }
        sc.close();
    }
}