public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k=127e-7f;
        double l= 2.1413e3;
        boolean m = false;

        boolean b1 = i == j && k > l;

        System.out.println("b1 = " + b1);
        
        boolean b2 = i == j || k > l;
        System.out.println("b2 = " + b2);
        // importante que si tenemos varias expresiones debemos tener la claridad como debe ser el resultado ya que con 
        // el OR podemos hacer que una expresion se de.
        boolean b3 = i == j && k > l || m == false;
        System.out.println("b3 = " + b3);
        // otro ejemplo con la misma información anterior pero la información cambia solo con unos parentesis () y la expresion cambia de true
        // false debido a la prioridad o nuveles de validacion de la información.
        boolean b4 = i == j && (k > l || m == false);
        System.out.println("b4 = " + b4);

        // un ejemplo de cambiar los parentesis
        boolean b5 = (i == j && k > l) || m == false;
        System.out.println("b5 = " + b5);
        
        // TENER ENCUENTA QUE LOS OPERADORES LOGICOS LA PRIORIDAD LO TIENE EL AND(||) SOBRE EL OR.
        boolean b6 = (i == j || k < l) && m == true;
        System.out.println("b6 = " + b6);
        // ejemplo explicito de lo que se define sobre la prioridad de los operadores
        
        boolean b7 = (true || true ) && false;
        System.out.println("b7 = " + b7);

        boolean b8 = true || false && false || false;// true
        System.out.println("b8 = " + b8);

        boolean b9 = ((true || false) && false )|| false;// false
        System.out.println("b9 = " + b9);
    }
}
