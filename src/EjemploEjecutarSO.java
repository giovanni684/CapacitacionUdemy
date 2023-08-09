import java.io.IOException;

public class EjemploEjecutarSO {
    public static void main(String[] args) {
        // nos permite ejecutar aplicacion con el metodos Exec y utilizamos el getRuntime para obtener la instrancia del
        // tiempo de ejecucion.
        Runtime rt = Runtime.getRuntime();
        // cuando ejecutemos un programa como ejm un NOTEPAD o editor de texto retorna sobre una clase
        // llamada Process de java.lang
        Process process ;
        try {
            //buena practica es colocar todo el TEXTo en mayoscula o minuscula.
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")){
                 process = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")){
                process = rt.exec("textedit");

            }else{
                //se utliza para linux
                process = rt.exec("gedit");
                }


            // se utiliza para esperar hasta que la aplicacion finalice.
            process.waitFor();
        } catch (Exception e) {
                System.err.println("El comando es desconocido : "+e.getMessage());
                System.exit(1);
        }
        System.out.println(" Se ha Cerrado el Editor.");
        System.exit(0);
    }
}
