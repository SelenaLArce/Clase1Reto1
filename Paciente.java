public class Paciente {
    //Atributos de clase
    String nombre;
    int edad;
    String expediente;

    //Metodo
    public void mostrarInformacion()
    {
        System.out.println("Paciente:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("EXP:" + expediente);
    }
}
