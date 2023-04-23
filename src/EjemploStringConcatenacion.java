public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andres Guzman";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10,numeroB=5;
        // muestra el texto como una concatenación debido a que el primer argumento del metodo es un String asume
        // que va a concatenar un String.
        System.out.println(detalle + numeroA + numeroB);

        // Se modifica el como realizar y agrupamos dentro de parentesis el cambia la presedencia esto significa
        // que tomara el primer valor como entero y luego String.
        System.out.println(detalle + (numeroA + numeroB));

        // otro ejemplo para no usar los parentesis es cambiar la presedencia que corresponde a primero los numeros
        // luego los String.
        System.out.println(numeroA + numeroB +detalle);

        String detalle2 = curso.concat(profesor);
        System.out.println(detalle2);

        detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
        
        

    }
}
