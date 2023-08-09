import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        //algo particular con esto es que el mes inicio desde 0 quiere decir que 0 = Enero,1 = febrero ,2 = marzo y asi sucesivamente.
        calendar.set(2020,11,12,16,20,12);
        // tambien podemos utilizar una constante ejm
        calendar.set(2020,Calendar.DECEMBER,12,16,20,12);

        // otro ejemplo setiando valor por valor se realiza de la siguiente manera.
        calendar.set(Calendar.YEAR,2020);
        calendar.set(Calendar.MONTH,Calendar.JULY);
        calendar.set(Calendar.DAY_OF_MONTH,25);
        //setiamos de esta misma manera los horas minutos y segundos
        //calendar.set(Calendar.HOUR_OF_DAY,21);// se trabaja la hora militar 00 - 23:59
        calendar.set(Calendar.HOUR,7); //trabaja la hora hasta las 0-11:59 AM o PM
        calendar.set(Calendar.AM_PM,Calendar.PM);// definicion si es PM o AM esto solo aplica si trabajamos con el formaro de Calendar.HOUR

        calendar.set(Calendar.MINUTE,20);
        calendar.set(Calendar.SECOND,10);
        calendar.set(Calendar.MILLISECOND,953);

        Date fecha = calendar.getTime();

        System.out.println("fecha = " + fecha);
        // tener encuenta lo siguiente si queremos mostrar las hora militar(HH) si queremos mostrar la hora normal (hh)
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
