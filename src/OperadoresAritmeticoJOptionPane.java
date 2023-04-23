import javax.swing.*;

public class OperadoresAritmeticoJOptionPane {
    public static void main(String[] args) {
        int i = 5,j=4,suma = i+j;

        System.out.println("suma = " + suma);
        //tener encuenta que caracter (+) es para concatenar por lo tanto hay que tener claro esto ejem lo que hace es concatenar (i+j = 54)
        // esto se da por el tipo como asi esto es de acuerdo a la secuencia primero esta el string y luego las variables entonces
        // java asume que todo es un STRING.
        System.out.println("i+j = " + i+j);
        // OTRO EJEMPLO si invertimos el valor de primero la operacion y luego el string
        // java va asumir que el tipo es un INT. y le concatena el string el valor seria (9 i+j=)
        System.out.println(i+j +" i+j  = " );
        
        // ya si metemos el tema la precedencia de los operadores donde los () tienen precedencia hay tenemos el valor
        // de acuerdo a lo esperado. el resultado es i+j = 9
        System.out.println("i+j = " + (i+j));

        //OPREDAOR TIPO RESTA

        int resta = i-j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i-j));
        
        int multi = i*j ;

        System.out.println("multi = " + multi);
        
        int div = i/j;
        float div2 = (float)i/(float) j;//debemos forzar a float a las variables tipo ya que no muestra los decimales
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);
        
        int resto = i%j;
        System.out.println("resto = " + resto);
        resto = 8%5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Numero :"));

        if (numero%2==0){
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar = " + numero);
        }
    }
}
