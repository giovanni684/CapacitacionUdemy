import javax.swing.*;

public class TareaNumeroTres {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Numero 1 a comparar :"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Numero 2 a comparar :"));

        int numero = 0;
        String mostrar ="";
        numero = (numero1 > numero2)?numero1:numero2;

        if (numero == numero1){
            mostrar = mostrar.concat(Integer.toString(numero)).concat(",").concat(Integer.toString(numero2));
        }else{
            mostrar = mostrar.concat(Integer.toString(numero)).concat(",").concat(Integer.toString(numero1));
        }

        System.out.println("números ordenados de mayor a menor = " + mostrar);


    }
}
