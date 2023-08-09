public class ArgumentosLineaComando {
    public static void main(String[] args) {
        if (args.length==0){
            // estados
            // 0 = todo esta bien
            // 1 = se lanza una excepcion
            // -1 = tenemos un ERROR
            System.out.println("Debe ingresar Argumentos o parámetros!");
            System.exit(-1);
        }
        for (int i = 0 ; i< args.length;i++){
            System.out.println(" Argumentos n° " + i + " : "+ args[i]);
        }
    }
}
