import java.util.Scanner;

public class TareaNumeroDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String nombreNuevo="";
        String nombre = "";
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Un  nombre."+i);


            nombre = scanner.nextLine(); //este metodo deja esperando hasta que digiten un valor (nextLine)

            int valorCaracteres=nombre.length();

            nombreNuevo += concatenarvalor(nombre,i,valorCaracteres);



        }

        System.out.println("nombreNuevo = " + nombreNuevo);

    }

    public static String concatenarvalor(String valor,int valorint,int valorCaracteres){

        if (valorint !=2){
            valor =    valor.substring(1,2).toUpperCase() + "."+valor.substring(valorCaracteres - 2)+"_";
        }else {
            valor =    valor.substring(1,2).toUpperCase() + "."+valor.substring(valorCaracteres - 2);
        }
        return valor;
    }


}
