import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Examen parcial PRG1");

        int edad;

        do {
            System.out.print("Introduce la edad del alumno (17-70): ");
            edad = sc.nextInt();

            if (edad < 17 || edad > 70) {
                System.out.println("Edad no valida. Intentalo de nuevo.");
            }

        } while (edad < 17 || edad > 70);

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        int asignaturas;

        do {
            System.out.print("Introduce el numero de asignaturas (1-10): ");
            asignaturas = sc.nextInt();

            if (asignaturas < 1 || asignaturas > 10) {
                System.out.println("Numero de asignaturas no valido. Intentalo de nuevo.");
            }

        } while (asignaturas < 1 || asignaturas > 10);

        for (int i = 1; i <= asignaturas; i++) {
            System.out.print("Nota de la asignatura " + i + ": ");
            int nota = sc.nextInt();
        }

        sc.close();
    }
}
