public class AutoBoxingInteger {
    public static void main(String[] args) {
        Integer[] enteros = {Integer.valueOf(1),2,3,4,5,6,7,8,9,10,11,12,13,14,15};// esto es autoboxing

        int suma = 0 ;

        for (Integer i:enteros) {
            // se realiza el boxing de forma explicita.
            if (i.intValue()%2 == 0 ){
                suma +=i.intValue();
            }
        }
        System.out.println("suma = " + suma);
        suma = 0;
        for (Integer i:enteros) {
            //tambien se puede realizar de esta manera ya que para las clase long,integer,double,short realiza un autoboxing
            if (i%2 == 0 ){
                suma +=i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
