public class operadorInstanceOfTiposGenericosAbstractos {
    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase String ... que tal!";

        Number num = 7;
        // nota: se debe tener la claridad del  tipo de dato y sus herencias para que esto
        // funcione de forma correcta de lo contrario va a dar error de sintaxis
        Boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo String = " + b1);

        boolean b2 = texto instanceof Object;

        System.out.println("texto es del tipo Object = " + b2);
        
        
        boolean b7 = texto instanceof Integer;

        System.out.println("texto es del tipo Integer = " + b7);
        

        boolean b3 = num instanceof Integer;

        System.out.println("num es del tipo Integer = " + b3);

        boolean b4 = num instanceof Number;

        System.out.println("num es del tipo Number = " + b4);

        boolean b5 = num instanceof Object;

        System.out.println("num es del tipo Number = " + b5);

       b5 = num instanceof Long;

        System.out.println("num es del tipo Long = " + b5);

        b5 = num instanceof Double;

        System.out.println("num es del tipo Double = " + b5);




        Number decimal = 5.54;
        boolean b6 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b6);

        b6 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + b6);
        b6 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + b6);

        b6 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b6);


        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);

    }
}
