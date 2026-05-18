import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese moneda de origen (USD/EUR): ");
            String origen = sc.nextLine();

            System.out.print("Ingrese moneda de destino (USD/EUR): ");
            String destino = sc.nextLine();

            System.out.print("Ingrese cantidad: ");
            String cantidadStr = sc.nextLine();

            double cantidad = Double.parseDouble(cantidadStr);

            double resultado = ConversorMonedas.convertir(origen, destino, cantidad);

            System.out.println("Resultado: " + String.format("%.2f", resultado));

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar una cantidad numérica válida.");

        } catch (MonedaNoSoportadaException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Programa finalizado.");
            sc.close();
        }
    }
}