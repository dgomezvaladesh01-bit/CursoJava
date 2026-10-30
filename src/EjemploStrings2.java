import javax.print.DocFlavor;

public class EjemploStrings2 {
    static void main() {
        //ejemplo2_strings();
        String nombre = "Pepe";
        String apellidos = "Martínez García";
        String nombreCompleto = nombre + apellidos;
        int longitud = nombre.length();
        int longitud2 = "245".length();
        char letra = apellidos.charAt(3);
        String cadena1 = nombreCompleto.substring(0,4);
        String cadena2 = " Hola ".trim(); //Hola
        String cadena3_1 = cadena1.substring(3,4); //e
        String cadena3_2 = cadena1.substring(3,3); //
        String cadena3_3 = cadena1.substring(4,3); //ERROR
        String cadena4 = (cadena2 + "Hola").toLowerCase(); //holahola
        int posicion1 = cadena4.indexOf("o"); //1
        int posicion2 = cadena4.indexOf("hola"); //
        int posicion3 = cadena4.indexOf("Hola");

    }
}

