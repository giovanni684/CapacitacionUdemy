import javax.swing.*;

public class TareaNombreMasLargo {
    public static void main(String[] args) {




        String nombreNuevo="";
        String nombre = "";

        int valorCaracteres = 0;
        for (int i = 0; i < 3; i++) {

            nombre = JOptionPane.showInputDialog("Ingresar Nombre y Apellido separado por Espacio. :");
            String[] arreglo2  = nombre.split(" ");
            nombreNuevo =arreglo2[0].split(" ").length >nombreNuevo.length() ?nombre:nombreNuevo ;

        }
        System.out.println("El nombre mas largo es = " + nombreNuevo);
    }
}
