import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScannerTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Un  numero entero.");


        int numerodecimal = 0;
        try {
            numerodecimal = scanner.nextInt();//Integer.parseInt(numeroStr); //este metodo deja esperando hasta que digiten un valor (nextLine)
        } catch (NumberFormatException b) {
            System.out.println("Error debe ingresar un numero entero.");
            main(args);
            System.exit(0);
        }catch (InputMismatchException e){
            System.out.println("Error debe ingresar un numero entero.");
            main(args);
            System.exit(0);
        }

        System.out.println("numerodecimal = " + numerodecimal);
        String resultadoBinario = "Numero Binario : " + numerodecimal+"="+ Integer.toBinaryString(numerodecimal);
        String resultadoOctal ="numero octal de  = " + numerodecimal +"=" + Integer.toOctalString(numerodecimal);
        String resultadoHex ="numero Hexadecimal= " + numerodecimal+"="+ Integer.toHexString(numerodecimal);

        String mensaje = resultadoBinario;
             mensaje  += "\n" + resultadoOctal;
             mensaje  += "\n" + resultadoHex;
        System.out.println(mensaje);
    }
}
