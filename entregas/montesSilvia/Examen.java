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

        System.out.print("Introduce el numero de asignaturas matriculadas: ");
        int asignaturas = sc.nextInt();

        sc.close();
    }
}
