import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        String name = scanner.nextLine();

        System.out.println("Introduce la cuidad donde vives:");
        String city = scanner.nextLine();

        System.out.println("Introduce cuántos años de experiencia tienes:");
        int experiencia = Integer.valueOf(scanner.nextLine());

        System.out.println("===Ficha===");
        System.out.println("Nombre: " + name);
        System.out.println("Cuidad: " + city);
        System.out.println("Experiencia: " + experiencia + " año(s).");

    }
}