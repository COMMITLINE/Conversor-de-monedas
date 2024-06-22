import java.util.Scanner;

public class SelectorMonedaMenu {
    String opcion1 = "USD";
    String opcion2 = "CLP";
    String opcion3 = "EUR";
    String opcion4 = "ARS";
    String opcion5 = "REALES";

    public void menuOperador(int seleccion, Scanner sc) {
        String monedaOrigen = "";
        String monedaDestino = "";
        double cantidadAConvertir;

        switch (seleccion) {
            case 1:
                monedaOrigen = opcion1;
                break;
            case 2:
                monedaOrigen = opcion2;
                break;
            case 3:
                monedaOrigen = opcion3;
                break;
            case 4:
                monedaOrigen = opcion4;
                break;
            case 5:
                monedaOrigen = opcion5;
                break;
            default:
                System.out.println("Selección no válida.");
                return;
        }

        System.out.println("Seleccionaste: " + monedaOrigen);
        System.out.println("Indica la moneda a la que deseas convertir:");
        System.out.println("1 - USD Dolar" +
                "\n2 - CLP Peso Chileno" +
                "\n3 - EUR Euro" +
                "\n4 - ARS Peso Argentino" +
                "\n5 - BRL Real Brasileño");

        int seleccionDestino = sc.nextInt();
        sc.nextLine();  // Consumir el salto de línea

        switch (seleccionDestino) {
            case 1:
                monedaDestino = opcion1;
                break;
            case 2:
                monedaDestino = opcion2;
                break;
            case 3:
                monedaDestino = opcion3;
                break;
            case 4:
                monedaDestino = opcion4;
                break;
            case 5:
                monedaDestino = opcion5;
                break;
            default:
                System.out.println("Selección no válida.");
                return;
        }
        System.out.println("Indica la cantidad que deseas convertir:");
        cantidadAConvertir = sc.nextDouble();
        sc.nextLine();  // Consumir el salto de línea

        consultarYMostrarMoneda(monedaOrigen, monedaDestino, cantidadAConvertir);
    }

    public static void consultarYMostrarMoneda(String tipoMonedaOrigen, String tipoMonedaDestino, double cantidad) {

        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda = consulta.consultaMonedaorigen(tipoMonedaOrigen);

        if (!moneda.conversion_rates().containsKey(tipoMonedaDestino)) {
            System.out.println("No se encontró la tasa de conversión para " + tipoMonedaDestino);
            return;
        }

        double tasaConversion = moneda.conversion_rates().get(tipoMonedaDestino);
        double cantidadConvertida = cantidad * tasaConversion;
        double valorMonedaOrigen = moneda.conversion_rates().get(tipoMonedaOrigen);

        System.out.println("------------------");
        System.out.println("Seleccionaste: " + tipoMonedaOrigen +
                            "\nCantidad: "+cantidad+
                            "\nCovertida a: "+tipoMonedaDestino+
                            "\nTasa de conversion: " +
                            "\n"+tipoMonedaOrigen + " = " + tasaConversion +
                            "\n"+ tipoMonedaDestino + " = " + valorMonedaOrigen +
                            "\nResultado: " +cantidad +" "+tipoMonedaOrigen + " son: " +cantidadConvertida+ " "+tipoMonedaDestino);
        System.out.println("-------------------");

    }
}
