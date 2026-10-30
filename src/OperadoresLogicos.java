import javax.annotation.processing.SupportedSourceVersion;

public class OperadoresLogicos {
    static void main() {
        int a=1, b2;
        boolean condicion1=false,condicion2=true;

        //&&=and True= true && true
        boolean resultado= condicion1&&condicion2;
        System.out.print(resultado);

        // ||=or True=true ||false
        resultado=condicion1||condicion2;
        System.out.println(resultado);
        //!not !false=true !true=false
        condicion1=!condicion1;
        System.out.println(condicion1);
    }
}

