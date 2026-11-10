package taller5;

public class Ejercicio5 {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante(
            "Carlos",
            20,
            85,
            90,
            95
        );

        System.out.println("Datos del estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.printf("Promedio: %.2f%n", estudiante.getPromedio());
    }
}
