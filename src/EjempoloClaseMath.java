public class EjempoloClaseMath {
    public static void main(String[] args) {

        // manejo del valor absoluto.
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        // me devuelve el valor mayor en ambos
        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);
        // me devuelve el valor minimo en ambos
        double min = Math.min(1.2,50);
        System.out.println("min = " + min);
        // como redondear el valor decimal hacia arriba no hacia abajo.
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);
        // como redondear el valor decimal hacia abajo y no hacia abajo.
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);
        // si queremos redondear un valor que respete si es ejm 3.5 lo tome al techo 
        // pero si es menor a 3.5 quiere decir 3.4 este lo redondea hacia abajo
        long valor = Math.round(3.4);
        System.out.println("valor = " + valor);
        long valor1 = Math.round(Math.PI);
        System.out.println("valor = " + valor1);

        // Exponente vamos a mirar de la clase matematica.
        // exp como base tiene 2.71828 elevado a 1
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);
        // logaritmo natular toma como base a EXP (2.71828)
        double log = Math.log(10);
        System.out.println("log = " + log);
        // sacamos la potencia que significa (10X10X10) = 1000
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);
        //Raiz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        //trigonometria 
        //convertir radianes a grados 
        double grados= Math.toDegrees(1.57);
        //esto se puede redondear
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);
        
        //convertir de grados a radianes
        double radianes = Math.toRadians(grados);
        System.out.println("convertir de gradoa a radianes = " + radianes);

        System.out.println("Math.sin(90) = " + Math.sin(radianes));
        System.out.println("Math.sin(90) = " + Math.cos(radianes));


        radianes = Math.toRadians(180);
        System.out.println("cos(180) = " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0.00) = " + Math.cos(radianes));
                
    }
}
