import java.util.Scanner;

public class operadorTernario {
    public static void main(String[] args) {
        //definicion de un ternario (variable = condicion ? si es verdadero:si es falso)

        String variable = 7 == 7 ? "Si es verdadero":"Si es Falso";
        System.out.println("variable = " + variable);
        
        String estado = "";
        
        double promedio = 0.0;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;
        Scanner scanner = new Scanner(System.in);
        // se debe tener encuenta como tenemos el sistema operativo para el manejo de decimales
        // ya que si se coloca 5.3 esto va arrojar error debe ser 5,3
        System.out.println("ingrese la nota de matematicas entre 2.0 - 7.0 :");
        matematicas = scanner.nextDouble();
        System.out.println("ingrese la nota de ciencias entre 2.0 - 7.0 :");
        ciencias = scanner.nextDouble();
        System.out.println("ingrese la nota de historia entre 2.0 - 7.0 :");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;




        
        estado = promedio>= 4.49 ? "Aprobado":"Rechazado";


        /*  esto del ternario es lo mismo que tener lo siguiente
        if(promedio >= 4.49){
                estado = "Aprobado";
        }else{
                estado = "Rechazado";
        }
        */
        System.out.println("promedio = " +estado + " "+ promedio);
    }
}
