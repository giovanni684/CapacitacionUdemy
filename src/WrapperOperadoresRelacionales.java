public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        // si es menor que 128 como valor va a comparar como primitivo o valor; Si es mayor a 127 entonces va asumir todo como Instancia
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // esto es verdadero por que num2 tiene la misma instancia del objeto num1
        System.out.println("Son el mismos object ?"+(num1==num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // esto es verdadero por que num2 tiene la misma instancia del objeto num1
        System.out.println("Son el mismos object ?"+(num1==num2));

        // para comparar si un objeto tiene el mismo valor se valida con la funcion equals
        System.out.println("se valida si tiene el mismo valor " + num1.equals(num2));
        // otra forma de realizar la comparacion es llevando el valor a primitivos
        System.out.println("se valida si tiene el mismo valor " + (num1.intValue() == num2.intValue()));
        
        num2 = 1000;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);
        
        boolean condicion2 = num1.intValue() > num2.intValue();
        System.out.println("condicion2 = " + condicion2);
        
        
    }
}
