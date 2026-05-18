import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            String input = sc.nextLine(); 

            int numero = Integer.parseInt(input);

            double resultado = 100 / numero; 

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");

        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un número válido");

        } finally {
            System.out.println("Programa finalizado correctamente");
            sc.close();
        }
    }
}
