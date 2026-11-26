import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Segundos a horas, minutos y segundos:");
        int totalSeconds = Integer.valueOf(scanner.nextLine());

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds / 60) % 60;
        int seconds = totalSeconds % 60;

        System.out.println(hours + " h, " + minutes + " min, " + seconds + " s");
    }
}
