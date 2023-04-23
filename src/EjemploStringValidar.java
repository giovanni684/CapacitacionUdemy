public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        
        boolean esNulo=curso ==null;
        System.out.println("esNulo = " + esNulo);
        if (esNulo){
            curso = " ";//""programación java ";
        }

        boolean esVacio = curso.length() == 0;
        
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);
        boolean esBlanco = curso.isBlank(); // esta desde la version 11 en adelante.

        System.out.println("esBlanco = " + esBlanco);

        if (!esBlanco){
            System.out.println(curso.toUpperCase());
            // no revienta concatenandolo de la siguiente manera.
            System.out.println("bienvenido al curso " + curso);
            // va a reventar por q la referencia es null.
            System.out.println(curso.concat("desde cero"));

        }





    }
}
