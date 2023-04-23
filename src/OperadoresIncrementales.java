public class OperadoresIncrementales {
    public static void main(String[] args) {
        int i = 1;
        //ejemplo de pre - incremento que significa que primero se incrementa y luego se asigna en orden de ideas
        // corresponde a i = 2 y j = 2;
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // post incremento que significa que al momento de asignarle el valor a j primero se asigna y luego se incrementa
        // esto corresponde a i=3 y j=2
        i= 2;
        System.out.println("i inicial = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // pre decremento
        i= 3;
        j = --i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Post decrmento
        i= 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j)); //primmero se incrementa luego se asigna valor a mostrar seria 5
        System.out.println("(j++) = " + (j++)); // luego se asgina y luego se incrementa valor a mostrar seria 5
        System.out.println("j valor final = " + j);



    }
}
