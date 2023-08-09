import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistemaOtrasCaracteristicas {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());// cargamos en el objeto todas las propiedades del sistema.
            p.load(archivo);// se carga lo que tenemos en el archivo de properties
            // otra forma de anexar mas propiedades es
            p.setProperty("mi.propiedad.personalizada","Mi valor guradado en el objeto properties");
            System.setProperties(p);// se utiliza para cargar las propiedades del archivo mas las del sistema
            String valorProperties = System.getProperty("config.puerto.servidor");
            System.out.println("como seleccionar una propiedad del sistema. = " + valorProperties);
            System.out.println("como seleccionar una propiedad del sistema. = " + System.getProperty("config.autor.email"));
            // si realizamos lo siguiente se evidencia que todavia no hemos realizado la carga de las propiedades
            System.getProperties().list(System.out);

            //como ejecutar el garbagecollect de forma explicita se realiza de la siguiente manera
            System.gc();

            // si todo sale bien utilizamos para salirno el CODIGO = 0
            System.exit(0);
        }catch (Exception e){
            System.err.println("No existe el archivo " + e);// esta forma me muestra el mensaje como un error de java.
            System.exit(1); // me ayuda a terminar la aplicacion
        }
    }
}
