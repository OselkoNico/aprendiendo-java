package mooc;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give another number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sum = firstNumber + secondNumber;

        double result = Math.sqrt(sum);

        System.out.println("The result is: " + result);
    }
}
