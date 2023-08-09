import javax.swing.*;

public class Tarea12 {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese el valor del radio de un círculo.");

        int numeroInt= 0;
        double area=0;
        try {
            numeroInt = Integer.parseInt(numeroStr);
            area = Math.PI * Math.pow(numeroInt,2);

        } catch (NumberFormatException b) {
            JOptionPane.showInputDialog(null,"Error debe ingresar valor numerico.");
            main(args);
            System.exit(0);
        }
        System.out.println("area = " + area);
    }
}
