import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class tarea11CalcularEdad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha de nacimiento con formato 'yyyy-mm-MM-dd'  ");
        try {
            Date fecha = format.parse(s.next());

            Date fecha2 = new Date();

            long valoredad = fecha2.getTime() -fecha.getTime();
            // como el valor es en milisegundos quiero saber como convertir este tiempo en años y lo debo dividir por 365 Dias /1000/60/60/24/365
            System.out.println("La edad que tiene es: " + (valoredad /1000/60/60/24/365));
            System.out.println("los dias que tiene es: " + (valoredad /(1000*60*60*24)%365));
            System.out.println("La edad que tiene es: " + (valoredad /(1000l * 60 * 60 * 24 * 365)));



            

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
