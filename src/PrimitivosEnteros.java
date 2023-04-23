public class PrimitivosEnteros {
    public static void main(String[] args) {
        //// tipo de dato byte
        byte numeroByte=127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Byte.MIN_VALUE);

        /// tipo de dato short
        short numeroShort = 32767;
        System.out.println("numeroByte = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short: " + Short.MIN_VALUE);
        // tipo de int
        int numeroInt = 2147483647;
        System.out.println("numeroByte = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor maximo de un short: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un short: " + Integer.MIN_VALUE);

        //TENER ENCUENTA QUE PARA EL MANEJO DE LONG SE DEBE DEFINIR AL FINAL CON LA LETRA 'L' EJM 2147483648L
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroByte = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor maximo de un short: " + Long.MAX_VALUE);
        System.out.println("valor minimo de un short: " + Long.MIN_VALUE);

        ///definicion de variable tipo var siempre que le asignemos un valor numerico siempre toma el valor
        // de int valor entero desde que no sea un valor mayor a int que es (2147483647) ya este se tendria q convertir
        // a un valor de float anteponiendo la letra 'L' al final del numero.
        var numeroVar = 127;


    }
}
