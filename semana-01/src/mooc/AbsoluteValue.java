package mooc;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.parseInt(reader.nextLine());

        if(number < 0) {
            System.out.println(number * -1);
        } else {
            System.out.println(number);
        }
    }
}
