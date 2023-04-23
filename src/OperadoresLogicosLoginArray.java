import java.util.Scanner;

public class OperadoresLogicosLoginArray {
    public static void main(String[] args) {


        // arreglos implicito ya que se define su valor.
        /*
        String[] userNames = new String[2];
        String[] passwords = new String[2];
        userNames[0] = "Giovanni";
        passwords[0] = "71275729";
        userNames[1] = "admin";
        passwords[1] = "12345";*/

        //Otra forma de definir un arreglo explicitamente.
        String[] userNames = {"Giovanni","admin"};
        String[] passwords = {"71275729","12345"};




        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el UserName : ");

        String usuario = scanner.nextLine();

        System.out.println(" Ingrese el Password : ");

        String clave = scanner.nextLine();

        boolean esAutenticado =  false;
        for (int i = 0; i <userNames.length ; i++) {
            if ( (userNames[i].equals(usuario) && passwords[i].equals(clave)) ){
                esAutenticado = true;
                break;
            }
        }

       if (esAutenticado){
            System.out.println("Bienvenido Usuario = ".concat(usuario).concat("!") );
        }else{
            System.out.println("Username o Contreseña Incorrecta!");
            System.out.println("Lo sentimos, Se requiere Autenticacion.");
        }

    }
}
