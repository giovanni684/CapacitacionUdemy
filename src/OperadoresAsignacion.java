public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5 , j = i+4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        i +=2; // esto es el equivalente a esto i = i+2;
        System.out.println("i = " + i);

        i+=5;// equivalente i=i+5;
        System.out.println("i = " + i);

        //resta
        j-=4; // j=j-4;
        System.out.println("j = " + j);
        // multiplicacion
        j *= 3;
        System.out.println("j = " + j);
        
        // operador para concatenar string
        String sqlString = " select * from clientes as c";
        sqlString += " Where c.nombre = 'Giovanni'";
        sqlString += " and c.activo = 'S'";
        System.out.println("sqlString = " + sqlString);
        
        //division
        j/= 2;
        System.out.println("j = " + j);


    }
}
