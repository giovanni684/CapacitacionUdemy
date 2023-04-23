public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
    


        String trabaLenguas = "trabalenguas";

        System.out.println("trabaLenguas.toCharArray() = " + trabaLenguas.toCharArray());
        char[] arreglo = trabaLenguas.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo = " + arreglo[i]);
        }

        System.out.println("trabaLenguas = " + trabaLenguas.split("a"));// lo que hace es realizar un
        // arreglo por medio de una expresion regular y toma como patron el que
        // se defina como valor. con esto imprimo el hash corresponde a la referencia en memoria.


        String[] arreglo2 = trabaLenguas.split("a");
        int l = arreglo2.length;

        for (int i = 0; i < l ; i++) {
            System.out.println("arreglo2 = " + arreglo2[i]);

        }


        String archivo =  "alguna.imagen.pdf";

        String[] archivoArr = archivo.split("\\.");// tambien se puede separar por medio de [] corchetes ejm [.] ó [a]
        l = archivoArr.length;
        for (int j = 0; j < l; j++) {
            System.out.println("archivoArr = " + archivoArr[j]);
        }

        String[] archivoArr2 = archivo.split("[.]");// tambien se puede separar por medio de [] corchetes ejm [.] ó [a]
        l = archivoArr2.length;
        for (int j = 0; j < l; j++) {
            System.out.println("archivoArr2 = " + archivoArr2[j]);
        }

        // esto es para seleccionar la extension del archivo.
        System.out.println("archivoArr2[l-1] = " + archivoArr2[l-1]);
    }
}
