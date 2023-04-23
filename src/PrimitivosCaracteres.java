public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'A';
        char caracter1 = '\u0040';//tipo de cato caracter unicode se muestra de la siguiente forma.
        char decimal =64;//equivalente a su valor decimal.
        System.out.println("caracter = " + caracter);
        System.out.println("caracter = " + caracter1);
        System.out.println("decimal = " + decimal);
        System.out.println("(decimal==caracter1) = " + (decimal==caracter1));
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("(simbolo==caracter1) = " + (simbolo==caracter1));
        var varSimbolo = '\u0040';

        System.out.println("char correspondiente en byte " + Character.BYTES);
        System.out.println("char correspondiente en bites " + Character.SIZE);
        System.out.println("char correspondiente valor minimo " + Character.MIN_VALUE);
        System.out.println("char correspondiente valor Maximo " + Character.MAX_VALUE);

        char espacio = ' ';//caracteres especiales
        char espacio2 = '\u0020';//caracteres especiales pero con codigo UNICODE
        char retroceso = '\b';//se realiza el retroceso de un espacio significa q se devuelve un espacio hacia atras.
        char tabulador = '\t'; // el tabulador
        char nuevaLinea = '\n'; // salto de linea
        char retocederCarro = '\r';//retornos de carro

        System.out.println("char correspondiente en byte:" +espacio + Character.BYTES);
        System.out.println("char correspondiente en bites:" +espacio2 + Character.SIZE);
        System.out.println("char correspondiente en bites retroceso:" +retroceso + Character.SIZE);
        System.out.println("char correspondiente en \t bites tabulador:" +tabulador + Character.SIZE);
        System.out.println("char correspondiente en \t bites nuevaLinea:" +nuevaLinea + Character.SIZE);
        System.out.println("char correspondiente en \t bites nuevaLinea:" +System.lineSeparator() + Character.SIZE);
        System.out.println("char correspondiente en  bites retocederCarro:" +retocederCarro + Character.SIZE);

        System.out.println("char correspondiente en bites " + Character.SIZE);
        System.out.println("char correspondiente valor minimo " + Character.MIN_VALUE);
        System.out.println("char correspondiente valor Maximo " + Character.MAX_VALUE);

    }
}
