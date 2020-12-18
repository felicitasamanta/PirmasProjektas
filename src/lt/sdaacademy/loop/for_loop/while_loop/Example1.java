package lt.sdaacademy.loop.for_loop.while_loop;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ivesite zodeli 'NE' ");
        String answer = scanner.nextLine();

        while (answer.equals("NE")) {
            System.out.println("Jei ivesite bet ka apart 'NE', programa baigs darba");
            answer = scanner.nextLine();


    }
        }
}
