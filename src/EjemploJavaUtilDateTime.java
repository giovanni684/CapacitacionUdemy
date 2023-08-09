import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDateTime {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);
        // todos los ejemplos de como utilizar el simpledateformat
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String fechaStr = df.format(fecha);
        long j= 0 ;

        for (int i = 0 ; i< 1000000000; i++){
            j+=i;
        }
        System.out.println("j = " + j);

        Date feha2 = new Date();
        long tiempoFinal = feha2.getTime() - fecha.getTime();
        System.out.println("tiempoFinal = " + tiempoFinal);

    }
}
