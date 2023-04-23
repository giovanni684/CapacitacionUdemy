import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scannerDet = new Scanner(System.in);
        System.out.println("Diligenciar la Factura:");
        String nombreFactura = scannerDet.nextLine();

        double precio1 =0, precio2= 0 ,valorImpuesto = 19,valorTotal= 0;
        String mensaje;
        try {
            System.out.println("Digitar Precio 1 :");
            precio1 = scannerDet.nextDouble();
            System.out.println("Digitar Precio 2 :");
            precio2 = scannerDet.nextDouble();
        } catch (InputMismatchException e ){
            System.out.println("Error de Datos debe digitar un valor decimal o numerico.");
            main(args);
            System.exit(0);
        }
        valorTotal = (precio1 + precio2) ;

        mensaje= " Descripción Factura: " + nombreFactura +"\n Total Bruto : " + String.valueOf(valorTotal) +
                "\n Impuesto : " + valorImpuesto +"\n Valor Total : "+ String.valueOf(valorTotal+(valorTotal * valorImpuesto)/100 );

        System.out.println(mensaje);
        
        
    }
}
