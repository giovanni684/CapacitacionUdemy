import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);
        // todos los ejemplos de como utilizar el simpledateformat
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        // cambiar el formato
        df = new SimpleDateFormat("dd-MM-yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        // cambiar el formato para que describa el mes MMMM
        df = new SimpleDateFormat("dd/MMMM/yyyy");
         fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        //formato como yo quiero
        df = new SimpleDateFormat("dd ' de ' MMMM , yyyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        //formato si quiero sabes adicional el dia de la semana antepongo la letra E es el dia abreviado o EEEE el nombre del dia completo antes del dia = dd
        df = new SimpleDateFormat("E dd ' de ' MMMM , yyyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        // las cuatro EEEE
        df = new SimpleDateFormat("EEEE dd ' de ' MMMM , yyyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
    }
}
