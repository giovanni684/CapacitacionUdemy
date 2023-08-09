import java.util.Scanner;

public class TareaOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador5 = 0 ,contadorinf = 0,notas1=0;
        double numeroComparar = 0,numeroComparar1 = 0,numeroinferior1 = 0,promediototal = 0,total=0;

        for (int i=1; i<= 20;i++ ){
            System.out.println("Ingrese numero a Comparar."+i+" de 20");
            numeroComparar = scanner.nextDouble();
            if (numeroComparar == 0){
                break;
            }
            else if (numeroComparar > 5 ){
                numeroComparar1 = numeroComparar + numeroComparar1 ;
                contador5++;
            } else if (numeroComparar<4) {
                numeroinferior1 = numeroComparar + numeroinferior1;
                contadorinf++;
                if (numeroComparar == 1){
                    notas1++;
                }
            }

            total = numeroComparar + total;
        }
        if (numeroComparar1 > 0){
            System.out.println("el promedio es mayor a 5  = " + (numeroComparar1/contador5));
        }
        if (numeroinferior1 > 0 ){
            System.out.println("el promedio inferior a 4 = " + (numeroinferior1/contadorinf));
        }
        System.out.println("cantidad de notas en 1 = " + notas1);

        promediototal = total/20 ;
        System.out.println("promedio total = " + promediototal);
    }
}
