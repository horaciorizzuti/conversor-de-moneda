import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion !=8){
            System.out.println("****************\n" +
                    "Bienvenido al conversor de Monedas\n" +
                    "Seleccione La conversión que desea realizar\n" +
                    "1) Dollar a Peso Argentino\n" +
                    "2) Peso Argentino a Dolar\n" +
                    "3) Dollar a Real Brasileño\n" +
                    "4) Real Brasileño a Dollar\n" +
                    "5) Dollar a Peso Colombiano\n" +
                    "6) Peso Colombiano a Dollar\n" +
                    "7) Convertir otra moneda\n" +
                    "8) Salir\n");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD","ARS",consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS","USD",consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","BRL",consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD",consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP",consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD",consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo del Sistema");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }

    }

}