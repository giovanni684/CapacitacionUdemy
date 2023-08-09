public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        // otro ejemplo mandado un objeto tampoco se ve afectado
        Integer j=20;

        System.out.println("iniciamos el metodo main con i = " + i+ " "+j);
        test(i);
        test(j);
        System.out.println("finaliza el metodo main con i se mantiene igual= " + i+ " "+j);
    }
    public static void test(int i){
        System.out.println("iniciamos el metodo test con i = " + i);
        i=35;
        System.out.println("finaliza el metodo test con i = " + i);

    }
}
