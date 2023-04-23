public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat=2.12e3F;//2120.0;
        float realFloat2=1.5e4F;//15000F;
        float realFloat3=1.5e-10F;//0.00000000015F;
        float realFloat4=0.00000000015F;//1.5e-10F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat2 = " + realFloat2);
        System.out.println("realFloat3 = " + realFloat3);
        System.out.println("realFloat4 = " + realFloat4);


        System.out.println("numeroByte = " + realFloat4);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("valor maximo de un Float: " + Float.MAX_VALUE);
        System.out.println("valor minimo de un Float: " + Float.MIN_VALUE);



        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("valor maximo de un double: " + Double.MAX_VALUE);
        System.out.println("valor minimo de un double: " + Double.MIN_VALUE);

        var varflotante = 3.1416;
        System.out.println("varflotante = " + varflotante);
    }
}
