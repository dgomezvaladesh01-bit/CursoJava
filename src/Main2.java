void main()
{
    String nombreCompleto= "Iván Hidalgo Gómez"; //Iván Hidalgo Gómez

    System.out.println("Tamaño de la cadena: " + nombreCompleto.length() );

    System.out.println( "La posición del primer espacio: " + nombreCompleto.indexOf(" ") );

    String nombre = nombreCompleto.substring(0, nombreCompleto.indexOf(" "));

    System.out.println(nombre);
}