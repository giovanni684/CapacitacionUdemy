public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragan trigo en un trigal trigo ,trigo trigo";
        String palabra = "trigo";
        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra ,cantidad = 0;
        char letra = 'g';
        etiqueta:
        for (int i = 0 ; i<= maxFrase;){
            int k = i;
            for (int j=0 ;j<maxPalabra;j++){
                if (frase.charAt(k++) != palabra.charAt(j)){
                    i++;
                    continue etiqueta;

                }
            }

            cantidad++;
            i=i + maxPalabra;
        }
        System.out.println("Encontrado = " + cantidad + " Veces el caracter '"+palabra+"' en la frase");
    }
}
