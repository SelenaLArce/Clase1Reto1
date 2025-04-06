import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Paciente paciente1 = new Paciente();
        Scanner scanner = new Scanner(System.in);

        // 1. Nombre del Paciente
        paciente1. nombre = "Lena Marie";
        // 2. Edad
        paciente1. edad = 25;
        // 3. Expediente
        paciente1. expediente = "EXP202409";
//Llama al metodo mostrarInformacion() para mostrar los datos en consola
       paciente1. mostrarInformacion();
    }
}
