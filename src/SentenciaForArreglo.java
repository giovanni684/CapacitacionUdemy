import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres= {"Andres","pepe","maria","paco","pepa"};
        int valor = nombres.length;
        for (int i= 0 ;i< valor;i++){
            System.out.println(i+".- "+nombres[i]);
        }
        // voy a omitir valores
        for (int i= 0 ;i< valor;i++){
            if (nombres[i].equalsIgnoreCase("Andres")||nombres[i].equalsIgnoreCase("pepa")){
                continue;
            }
            System.out.println(i+".- "+nombres[i]);
        }
        // voy a omitir valores otro ejemplo
        for (int i= 0 ;i< valor;i++){
            if (nombres[i].toLowerCase().contains("Andres".toLowerCase())||nombres[i].toLowerCase().contains("pepa".toLowerCase())){
                continue;
            }
            System.out.println(i+".- "+nombres[i]);
        }
        //busacar un nombre \ es un caracter de escape
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"pepe\" o \"maria\":");
        System.out.println("buscar = " + buscar);
        boolean encontrado = false;
        for (int i=0 ;i<valor;i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar + " Fue encontrado!");
        }else {
            JOptionPane.showMessageDialog(null,buscar + " No existe en el sistema!");
        }
    }
}
