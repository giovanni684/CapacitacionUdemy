public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        // ejemplo de iteraccion normal
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("i = " + i);
        }
        // ejemplo de crear etiquetas esto nos sirve para afectar esta seccion de codigo.
        prueba:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue prueba;//se brinca el valor del for donde esta prueba que corresponde for (int i = 0; i < 5; i++)
                }
                System.out.print("[i = " + i +",j = "+ j +"]");
            }
        }
        System.out.println("\n=============================================================");
        // ejemplo de crear etiquetas esto nos sirve para afectar esta seccion de codigo.
        etiquetabreak:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiquetabreak;//se brinca el valor del for donde esta prueba que corresponde for (int i = 0; i < 5; i++)
                }
                System.out.print("[i = " + i +",j = "+ j +"]");
            }
        }
        System.out.println("\n=============================================================");
        // ejemplo de crear etiquetas esto nos sirve para afectar esta seccion de codigo.
        prueba:
        for (int i = 1; i <=7; i++) {
            int j = 1;
            while( j <=8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": descanso de fin de semana!");
                    continue prueba;//se brinca el valor del for donde esta prueba que corresponde for (int i = 0; i < 5; i++)
                }
                System.out.println("Dia " + i + ": trabajando a las " + j +" Hrs. ");
                j++;
            }
        }
    }
}
