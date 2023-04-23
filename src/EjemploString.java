public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        
        //compara por objeto y como son dos instancias diferente por eso esto da el valor de FALSE.
        boolean esigual = curso ==curso2;
        System.out.println("curso ==curso2 = " + esigual);
        
        // Forma correcta de comparar un valor.
        esigual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esigual);
        // Otro ejemplo es comparar (curso) con (curso3); esto es TRUE por que la instancia de String es la misma ya que
        // que no creamos una instancia con evento NEW.
        String curso3 = "Programación Java";
        
        esigual = curso==curso3;
        System.out.println("curso==curso3 = " + esigual);

        
        

    }
}
