public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.8f;

        if (promedio>= 6.5){
            System.out.println("Felicitaciones, Excelente promedio.");
        }else if (promedio >= 6.0 ) {
            System.out.println("buen promedio.");
        } else if (promedio >= 5.0) {
            System.out.println("promedio regular.");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar mas.");
        }else {
            System.out.println("Reprobado.");
        }
        System.out.println("tu promedio es = " + promedio);
    }
}
