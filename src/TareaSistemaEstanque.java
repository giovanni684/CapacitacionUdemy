import javax.swing.*;

public class TareaSistemaEstanque {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Numero :"));
        int validar = 0;
        String mensaje="";

        if (numero1==70){
            mensaje = "imprimir Estanque lleno.";

        } else if (numero1 >= 60 && numero1 < 70 ) {
            mensaje = "imprimir Estanque casi lleno.";
        } else if (numero1 >= 40 && numero1 < 60 ) {
            mensaje = "imprimir Estanque  3/4.";
        } else if (numero1 >= 35 && numero1 < 40 ) {
            mensaje = "imprimir Medio Estanque .";
        } else if (numero1 >= 20 && numero1 < 35 ) {
            mensaje = "imprimir Suficiente .";
        }else {
            mensaje = "imprimir Insuficiente.";
        }

        System.out.println("mensaje = " + mensaje);

    }
}
