import javax.annotation.processing.SupportedOptions;
import java.sql.SQLOutput;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b= "b";
        String c= a;
        StringBuilder sb = new StringBuilder(a);
        long inicio =  System.currentTimeMillis();
        // se analiza el rendimiento del proceso de concatenar y tenemos mejor tiempo el StringBuilder.

        for (int i=0;i<100000;i++){
            c=c.concat(a).concat(b).concat("\n");//500=> 3 ms,1000=>6 ms,10000=>179 ms,100000=>5864 ms
           // c+= a+b+"\n"; //500=> 24 ms, 1000=>26 ms,10000=>127 ms,100000=>2647 ms
          // sb.append(a).append(b).append("\n"); // 500=> 0 , 1000=>0 ms,10000=>3 ms  ,100000=>17 ms
        }


        long fin = System.currentTimeMillis();

        System.out.println(fin -inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        
        

    }
}
