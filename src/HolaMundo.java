public class HolaMundo {
    public static void main(String[] args) {
        String saludar ="Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int numero=11;
        boolean valor=true;
        int numero2=10;
        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
            // esta variable solo se puede utilizar dentro del ambito del IF ya que no tiene validez sino dentro de este
            // por fuera del if no se conoce asi este dentro del metodo o funcion.
            String valor2 = "valor";
        }
        System.out.println("numero = " + numero);

        //otra definicion de variable es la palabra var esta definicion de comporta de forma dinamica.
        // quiere decir que si le asignamos un valor string es una variable string o si asignamos un valor
        // entero se convierte en un valor entero
        var numer03 = "Gio";
        var numero4 = 20;
        String nombre;
        nombre = "Gio";
        if (numero >10) {
            nombre ="juan";
        }
        System.out.println("nombre = " + nombre);
    }



}
