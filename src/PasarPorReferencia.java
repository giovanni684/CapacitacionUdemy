public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10,20,30};


        System.out.println("iniciamos el metodo main ");

        for (int i=0;i<edad.length;i++){
            System.out.println("edad = " + edad[i]);
        }
        test(edad);
        System.out.println("despues de llamar el metodo test");
        for (int i = 0 ; i< edad.length;i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("finaliza el metodd main.");
    }
    public static void test(int[] edadArr){
        System.out.println("iniciamos el metodo test ");
        for (int i = 0 ; i< edadArr.length;i++){
            edadArr[i]+=20;
        }
        System.out.println("finaliza el metodo test ");

    }
}
