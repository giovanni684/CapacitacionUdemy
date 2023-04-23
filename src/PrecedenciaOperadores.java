public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j = 8 ;
        int k= 20;

        double promedio = (i+j+k)/3d;
        System.out.println("promedio = " + promedio);


        //se va analizar la prioridad de acuerdo al siguiente ejemplo
        promedio = i+j+k/3d*10;//14+8+66.6=> primero divide luego multiplica por que primero inicia de IZQ a Derecha
        System.out.println("promedio = " + promedio);
        // otro ejemplo
        //primero de acuerdo a la tabla de prioridad primero realiza las operaciones de preincremento y postincremento
        //(15 + 8) luego divide k/3 despues de dividir realiza la multiplicacion y luego realiza la suma.
        //(15+8) + 66.6 = 89.66
        promedio = ++i+ j-- +k/3d*10;
        System.out.println("promedio = " + promedio);

        //NOTA es muy importante manejar el tema de los parentesis.
    }
}
