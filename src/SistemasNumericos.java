public class SistemasNumericos {
    public static void main(String[] args) {

        int numerodecimal= 500;
        System.out.println("numerodecimal = " + numerodecimal);

        System.out.println("Numero Binario = " + numerodecimal+"="+ Integer.toBinaryString(numerodecimal));
        //numero binario asi se define se antepone el valor de (0b) al numero y ya lo toma el sistema como BINARIO.
        int numerobinario = 0b111110100;
        System.out.println("numerobinario = " + numerobinario);

        System.out.println("numero octal de  = " + numerodecimal +"=" + Integer.toOctalString(numerodecimal));
        //764 se le antepone el valor de cero al inicio y el sistema ya lo relaciona como un OCTAL
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero Hexadecimal= " + numerodecimal+"="+ Integer.toHexString(numerodecimal));
        // Si vamos a identifica que un numero va a ser un hexadecimal se debe definir(0x) ejemplo 500 = 1f4
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

    }
}
