public class EjemploStrings {
    static void main(String[] args) {
        //ejemplo1_string();

     }

    private static void ejemplo1_string() {
        String nada= "";//cadena vacía
        String nombre= "Pepe";
        String apellido= "Martínez";
        String nombreCompleto1= nombre + apellido;// PepeMartínez
        String nombreCompleto2= nombre +" " + apellido; //Pepe Martínez

        System.out.println(nada);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombreCompleto1);
        System.out.println(nombreCompleto2);
    }
}
