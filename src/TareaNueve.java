import java.util.Scanner;

public class TareaNueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double numeroComparar = 0,total=0,contador = 0;
        System.out.println("Ingrese 1 numero a multiplicar.");
        contador = scanner.nextDouble();
        contador = contador< 0 ?  -contador :contador;
        System.out.println("Ingrese 2 numero a multiplicar.");
        numeroComparar = scanner.nextDouble();
        numeroComparar = numeroComparar< 0 ?  -numeroComparar :numeroComparar;
        for (int i=0; i< contador;i++ ){
            total = numeroComparar + total;

        }

        System.out.println("Resultado = " + total);
   }
}
