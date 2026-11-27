import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give me your age:");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("Are you a resident? Answer s or n:");
        String resident = reader.nextLine();

        double precio = 10;

        if (age < 12 || age > 65) {
            precio = precio /2;
        }
        if (resident.equals("s")) {
            precio = precio -2;
        }

        System.out.printf("Precio: %.2f €%n", precio);
    }
}
