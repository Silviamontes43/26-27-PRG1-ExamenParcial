import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Examen parcial PRG1");

        System.out.print("Introduce la edad del alumno: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        sc.close();
    }
}
