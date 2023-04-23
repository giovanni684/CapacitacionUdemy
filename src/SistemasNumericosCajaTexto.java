import javax.swing.*;

public class SistemasNumericosCajaTexto {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null,"INgrese Un  numero entero.");

        int numerodecimal= 0;
        try {
            numerodecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException b) {
            JOptionPane.showInputDialog(null,"Error debe ingresar un numero entero.");
            main(args);
            System.exit(0);
        }


        String resultadoBinario = "Numero Binario = " + numerodecimal+"="+ Integer.toBinaryString(numerodecimal);
        String resultadoOctal ="numero octal de  = " + numerodecimal +"=" + Integer.toOctalString(numerodecimal);
        String resultadoHex ="numero Hexadecimal= " + numerodecimal+"="+ Integer.toHexString(numerodecimal);

        String mensaje = resultadoBinario;
             mensaje  += "\n" + resultadoOctal;
             mensaje  += "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
