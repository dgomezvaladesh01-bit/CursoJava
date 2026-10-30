public class EjemploBreak {
    static void main() {
        //Escribir los 5 primeros números usando
        //while (true) y break
        int num=1;
        while(true){
            System.out.println(num);
            num++;
            if (num>5){
                break;
            }
        }
    }
}
