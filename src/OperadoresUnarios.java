public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;

        int j =+i;// esto es el equivalente a j = (1)*i cambia el valor a -5
        System.out.println("j = " + j);

        int k =-i; // esto es el equivale  a k = (-1) * i cambia el valor a 5
        System.out.println("k = " + k);

        i=9;
        j=+i;
        System.out.println("j = " + j);

        k=-i;
        System.out.println("k = " + k);
    }
}
