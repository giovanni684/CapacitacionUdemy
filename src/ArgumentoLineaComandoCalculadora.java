public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length==0){

            System.err.println("Se debe ingresar algun valor en los parametros.");
            System.exit(-1);
        } else if (args.length != 3) {
            System.err.println("Por favor ingresar una operacion (suma,resta,div o multi) " +
                                 "Y 2 numeros enteros");
            System.exit(-1);

        }
        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;
        try{
             a = Integer.parseInt(args[1]);
             b = Integer.parseInt(args[2]);

        }catch (NumberFormatException e){
            System.err.println("los valores deben ser numericos.");
            System.exit(-1);
        }


        switch (operacion){
            case "suma":
                resultado = a+b;
                break;
            case"resta":
                resultado= a-b;
                break;
            case "multi":
                resultado=a*b;
                break;
            case "div":
                if (b==0){

                    System.err.println("no se puede dividir por ZERO.");
                    System.exit(-1);
                }
                resultado= (double) a/b;
                break;
            default:
                resultado= a+b;
        }

        System.out.println("resultado = '"+operacion +"' es : " + resultado);

    }
}
