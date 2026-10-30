import java.util.Scanner;

public class EjercicioTablaMultiplicar {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("dame un numero");
        int num = teclado.nextInt();

        for (int i = 0; i <=10 ; i++) {
            int resultado=num*i;
            System.out.println(num+"*"+"="+resultado);

        }


}
