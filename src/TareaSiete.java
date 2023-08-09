import java.util.InputMismatchException;
import java.util.Scanner;

public class TareaSiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero de valores a Comparar.");
        int numerodecimal = 0;
        int numeroComparar = 0,numeroComparar1 = 0;
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
        for (int i=1; i<= numerodecimal;i++ ){
            System.out.println("Ingrese numero a Comparar."+i+" de "+numerodecimal);
            numeroComparar = scanner.nextInt();
            if (numeroComparar < numeroComparar1 ){
                numeroComparar1 = numeroComparar;
            } else if (i==1) {
                numeroComparar1 = numeroComparar;
            }


        }
        if (numeroComparar1 < 10 ){
            System.out.println("El número menor es menor que 10! = " + numeroComparar1);
        }else {
            System.out.println("el numero menor es igual o mayor que 10! = " + numeroComparar1);
        }

    }
}
