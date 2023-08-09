class Personas{
    private String nombre;

    public String leerNombre(){
        return this.nombre;
    }
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
}


public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Personas personas = new Personas();
        System.out.println("iniciamos el metodo main ");
        personas.modificarNombre("Giovanni");


        System.out.println("personas = " + personas.leerNombre());


        test(personas);

        System.out.println("despues de llamar el metodo test");
        System.out.println("personas = " + personas.leerNombre());
        System.out.println("finaliza el metodd main.");
    }
    public static void test(Personas persona){
        System.out.println("iniciamos el metodo test ");
        persona.modificarNombre("fernando");
        System.out.println("finaliza el metodo test ");

    }
}
