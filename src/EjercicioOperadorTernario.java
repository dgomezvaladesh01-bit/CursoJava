import java.util.Scanner;

public class EjercicioOperadorTernario {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = teclado.nextInt();

        String resultado = (edad >= 18) ? "Eres mayor o igual de 18" : "Eres menor de 18";
        System.out.println(resultado);

    }
}
