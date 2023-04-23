public class ConversionDeTipos {
    public static void main(String[] args) {

        // Convertir String a cualquier tipo de dato.
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //Ejemplo con notacion cientifica ejm 98765.43e-3
        String realStr1 = "98765.43e-3";
        double realDouble1 = Double.parseDouble(realStr1);
        System.out.println("realDouble1 = " + realDouble1);
        
        String logicoStr = "false";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBOolean = " + logicoBoolean);


        // convertir un entero a String forma de realizarlo con la clase wrapper Integer
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        //otra forma de realizar la conversion de un número entero a String
        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        // forma de realizarlo con la clase wrapper DOUBLE
        String otroRealStr = Double.toString(1.23456);
        System.out.println("otroRealStr = " + otroRealStr);
        String otroRealStr1 = Double.toString(1.23456e2);
        System.out.println("otroRealStr1 = " + otroRealStr1);

        // otra forma de realizarlos con la clase String
        otroRealStr = String.valueOf(3.1416);
        System.out.println("otroRealStr = " + otroRealStr);
        otroRealStr = String.valueOf(3.1416e2F);// tipo de dato float
        System.out.println("otroRealStr = " + otroRealStr);


        //CONVERTIR PRIMITIVOS EN OTRO PRIMITIVO ATREVEZ DE CLASES WRAPPER
        // hay que tener en cuenta el valor maximo de la variable; Ya que si es mayor a su capacidad puede botar
        // la información ejemplo el valor de short el maximo es de 32767; Si le ponemos un valor mas alto
        // la variable puede dar negativo y error.
        // solo podemos realizar CAST a tipos numericos.
        int i = 100000;
        short s = (short) i;
        System.out.println("s = " + s);
        long l=i;
        System.out.println("l = " + l);
        /* ejemplo de error si lo ponemos a un valor char por que este lo va a organizar como un valor UNICODE
         si miramos el float funciona de forma correcta. */
        char b =(char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);


    }
}
