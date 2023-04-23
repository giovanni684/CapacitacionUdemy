import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {


        String username = "Giovanni";
        String password = "71275729";
        String username2 = "admin";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el UserName : ");

        String usuario = scanner.nextLine();

        System.out.println(" Ingrese el Password : ");

        String clave = scanner.nextLine();

        boolean esAutenticado =  false;

        if ( (username.equals(usuario) && password.equals(clave)) || (username2.equals(usuario) && password2.equals(clave)) ){
            esAutenticado = true;
        }else {
            System.out.println("Username o Contreseña Incorrecta!");
        }

        if (esAutenticado){
            System.out.println("Bienvenido Usuario = ".concat(usuario).concat("!") );
        }else{
            System.out.println("Lo sentimos, Se requiere Autenticacion.");
        }

    }
}
