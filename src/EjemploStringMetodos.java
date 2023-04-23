public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Giovanni";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Giovanni\") = " + nombre.equals("Giovanni"));
        System.out.println("nombre.equals(\"giovanni\") = " + nombre.equals("giovanni"));
        System.out.println("nombre.equals(\"giovanni\") = " + nombre.equalsIgnoreCase("giovanni"));
        System.out.println("nombre.equals(\"giovanni\") = " + nombre.compareTo("Giovanni"));
        System.out.println("nombre.equals(\"giovanni\") = " + nombre.charAt(0));
        System.out.println("nombre.equals(\"giovanni\") = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()-1)) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1,6));
        System.out.println("nombre.substring(1)-2 = " + nombre.substring(nombre.length()-2));

        String trabaLenguas = "trabalenguas";
        System.out.println("trabaLenguas.replace(\"a\",\".\") = " + trabaLenguas.replace("a","."));

        System.out.println("trabaLenguas.indexOf(\"a\") = " + trabaLenguas.indexOf("a"));// encuentra la primera ocurrencia si no lo encuentra devuelve el valor de -1
        System.out.println("trabaLenguas.lastIndexOf(\"a\") = " + trabaLenguas.lastIndexOf("a"));// encuentra la ultima ocurrencia si no lo encuentra devuelve el valor de -1
        System.out.println("trabaLenguas.contains(\"T\") = " + trabaLenguas.contains("T"));// sirve para validar si palabra o letra esta dentro deñ string si e asi devuelve un Boolean
        System.out.println("trabaLenguas.startsWith() = " + trabaLenguas.startsWith("tenguas"));// valida si inicia con la secuencia definida devuelve un boolean.
        System.out.println("trabaLenguas.endsWith(\"lenguas\") = " + trabaLenguas.endsWith("lenguas"));// valida que finalice con la secuencia definido.
        System.out.println(" trabalenguas    ".trim()  );
        System.out.println(" trabalenguas    " );
    }
}
