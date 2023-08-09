import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
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

        }catch (Exception e){
            System.out.println("No existe el archivo " + e);
        }
    }
}
