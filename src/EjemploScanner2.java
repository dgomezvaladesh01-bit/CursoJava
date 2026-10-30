import java.util.Scanner;

public class EjemploScanner2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        while (teclado.hasNextInt()) {
            System.out.println("Introduce un número: ");
            int numero = teclado.nextInt();
            System.out.println("Numero introducido: " + numero);
            System.out.println("Introduce un número:")
        }

    }
}
