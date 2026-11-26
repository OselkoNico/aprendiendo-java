import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Añade temperatura en Celsius:");
        double temperaturaCelsius = Double.valueOf(scanner.nextLine());

        double gradosFahrenheit = temperaturaCelsius * 9 / 5 + 32;

        System.out.println(temperaturaCelsius + " ºC son " + gradosFahrenheit + " ºF");
    }
}