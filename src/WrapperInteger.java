public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        Integer intObject3 =  Integer.valueOf(intPrimitivo);//boxing otra forma de realizarlo

        Integer intObject =  Integer.valueOf(32768);//boxing
        Integer intObject2 = 32768; //Autoboxing
        System.out.println("intObject = " + intObject);

        //como realizar para que una clase wrapper Integer(objeto de referencia) se convierta en primitivo.
        int valor  = intObject;//implicita
        System.out.println("valor = " + valor);
        int num = intObject.intValue(); //explicito
        System.out.println("num = " + num);
        // convertir un String a un Integer
        String valorTvLcd = "67000";
        Integer valor1 = Integer.valueOf(valorTvLcd);
        System.out.println("valor1 = " + valor1);
        // se debe tener claridad de que short solo soporta 32767 si le asignamos un valor mayor podemos
        // perder informacion
        Short shortObject = intObject.shortValue();
        System.out.println("shortObject = " + shortObject);
        // el valor maximo es 127 no puedo poner un valor si es mayor a su capacidad da perdida de informacion.
        Byte byteObject = intObject.byteValue();
        System.out.println("byteObject = " + byteObject);
        
        Long longObject = intObject.longValue();
        System.out.println("longObject = " + longObject);
    }
}
