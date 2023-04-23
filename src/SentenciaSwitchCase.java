import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 3 ;
        System.out.println("Digite el numero del mes a consultar.");
        int mes = scanner.nextInt();
        String nombreMes = null;
         switch (mes){
             case 1:
                 nombreMes = "Enero";
                 break;
             case 2:
                 nombreMes = "febrero";
                 break;
             case 3:
                 nombreMes = "Marzo";
                 break;
             case 4:
                 nombreMes = "Abril";
                 break;
             case 5:
                 nombreMes = "Mayo";
                 break;
             case 6:
                 nombreMes = "Junio";
                 break;
             case 7:
                 nombreMes = "Julio";
                 break;
             case 8:
                 nombreMes = "Agosto";
                 break;
             case 9:
                 nombreMes = "Septiembre";
                 break;
             case 10:
                 nombreMes = "Octubre";
                 break;
             case 11:
                 nombreMes = "Noviembre";
                 break;
             case 12:
                 nombreMes = "Diciembre";
                 break;
             default:
                 System.out.println("Mes seleccionado no es valido.");
         }
        System.out.println("nombreMes = " + nombreMes);





        switch (numero){
            case 0:
                System.out.println(" numero cero = " + numero);
                break;
            case 1:
                System.out.println("numero uno = " + numero);
                break;
            case 2:
                System.out.println("numero dos = " + numero);
                break;
            case 3:
                System.out.println("numero tres = " + numero);
                break;
            default:
                System.out.println("numero o caracter desconocido.");
        }

        String nombre = "andres";

        switch (nombre){
            case "admin":
                System.out.println("hola admin ,Bienvenido.");
                break;
            case "andres":
                System.out.println("hola andres!");
                break;
            case "pepe":
                System.out.println("hola pepe!");
                break;
            default:
                System.out.println("Usuario desconocido.");


        }

    }
}
