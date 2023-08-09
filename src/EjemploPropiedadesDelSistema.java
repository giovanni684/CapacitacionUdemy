import java.util.Properties;

public class EjemploPropiedadesDelSistema {
    public static void main(String[] args) {

        //tener encuenta la siguiente ruta siempre que se vaya a revisar cualquier variable de entorno
        // https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
        String userName = System.getProperty("user.name");// identificamos el usuario
        System.out.println("userName = " + userName);

        String home = System.getProperty("user.home");// ruta del usuario dentro del sistema operativo
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");// el directorio donde se encuentra el proyecto.
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");// propiedad de salto de linea
        System.out.println("lineSeparator = " + lineSeparator+ "Una linea Nueva .....");
        // hay una forma de imprimir todas las propiedades en consola
        Properties p = System.getProperties();// creamos un objeto con todas las propiedades del sistema
        p.list(System.out);// le decimos que realice la impresion en consola del objeto que listamos.
    }
}
