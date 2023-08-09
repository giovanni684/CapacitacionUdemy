import java.util.Map;
import java.util.Set;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {
        Map<String,String> varEnv = System.getenv();

        System.out.println("Variables de Ambiente del sistema= " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String temPath = System.getenv("PATH");
        System.out.println("temPath = " + temPath);

        // Otra forma puede ser de la siguiente manera
        String temPath2 = varEnv.get("ALLUSERSPROFILE");// tener encuenta que debe ser exactamente igual como se tiene escrito
        System.out.println("temPath2 = " + temPath2);


        // se va a recorer el MAP
        System.out.println("======== variables de entorno del sistema ====== " );
        // se va a trabajar con el KEY ya que por medio de este podemos recorrer el MAP
        //Type parameters:
        //<K> – the type of keys maintained by this map <V> – the type of mapped values

        for (String key:varEnv.keySet()) {
            System.out.println(key +"=> " + varEnv.get(key));


        }

    }
}
