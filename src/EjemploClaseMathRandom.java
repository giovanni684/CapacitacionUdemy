import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println("random = " + random);
        // buscamos un numero entre 0 y 6 por que nunca incluye el 7;
        random *=7;
        System.out.println("random = " + random);
        
        // si queremos redondear hacia abajo utilizamos la funcion floor.
        random = Math.floor(random);
        System.out.println("random = " + random);

        // otro ejemplo realizando con un arreglo clae math
        random =Math.random();
        String[] colores = {"Azul","Amarillo","Rojo","Verde","Blanco","Negro"};
        System.out.println("random antes de multiplicar = " + random);
        random *= colores.length;
        System.out.println("colores.length = " + colores.length);
        System.out.println("random multiplicacion= " + random);
        random = Math.floor(random);
        System.out.println("random = " + random);
        System.out.println("colores[random] = " + colores[(int) random]);

        /// vamos a trabajar con la clase random
        Random randomObj = new Random();
        // puede dar un posible valor de 2 exp 32 tanto positivo como un valor negativo. de forma aleatoria.
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);
        // LONG
        long randomlong = randomObj.nextLong();
        System.out.println("randomInt = " + randomlong);
        
        //puedo mandar un valor como argumento pero el valor de este no se incluye dentro del resultado
        randomInt = randomObj.nextInt(6);
        System.out.println("randomInt = " + randomInt);

        // si quiero tener un valor entre 15 y 25
        Random randomObje = new Random();
        // me respeta el valor entre 15 y 24 no incluye el valor de 25.
        int randomint2 = 15 + randomObje.nextInt(25-15);
        System.out.println("randomint2 = " + randomint2);

        // si quiero manejar arreglos y imprimirlos 
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores[randomInt] = " + colores[randomInt]);


    }
}
