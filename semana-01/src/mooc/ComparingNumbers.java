package mooc;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number:");
        int number1 = Integer.parseInt(reader.nextLine());

        System.out.println("Give another number:");
        int number2 = Integer.parseInt(reader.nextLine());

        if(number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + " is smaller than " + number2);
        } else {
            System.out.println(number1 + " is equal to " + number2);
        }
    }
}
