public class SentenciaWhile {
    public static void main(String[] args) {
        int i= 0;
        while (i<5){
            System.out.println("i = " + i);
            i++;
        }
        i=0;
        boolean prueba= true;
        while (prueba){
            if (i==7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }
        prueba = false;
        do {
            System.out.println("Esto se va a ejecutar una sola vez.");
        }while (prueba);

        do {
            if (i==10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;

        }while (prueba);
    }
}
