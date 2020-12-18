package lt.sdaacademy.loop.for_loop.while_loop;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = 0;

        while (number <90) {
            number = rnd.nextInt(100); //maksimali galima reiksme - 100
            System.out.println(number);
            if (number > 80) {
                break;
                // ctrl + alt + l sutvarko eilutes
            }

        }
    }
}
