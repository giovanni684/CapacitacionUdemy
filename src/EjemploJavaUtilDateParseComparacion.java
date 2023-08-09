import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParseComparacion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con formato 'yyyy-mm-MM-dd' ");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
            Date fecha2 = new Date();
            // se puede traducir como mayor
            if (fecha.after(fecha2)){
                System.out.println("fecha del usuario es despues que fecha2.");
            } else if (fecha.before(fecha2)) {
                System.out.println("fecha del usuario es anterior que fecha2.");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha del usuario es igual que fecha2.");
            }

            // otra forma de realizar  la comparacion
            if (fecha.compareTo(fecha2) > 0){
                System.out.println("fecha del usuario es despues que fecha2.");
            } else if (fecha.compareTo(fecha2) < 0 ) {
                System.out.println("fecha del usuario es anterior que fecha2.");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("fecha del usuario es igual que fecha2.");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
