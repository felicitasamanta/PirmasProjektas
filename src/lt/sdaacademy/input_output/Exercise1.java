package lt.sdaacademy.input_output;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Įveskite pirmą skaičių");
        double doubleNum1 = scanner.nextDouble();

        System.out.println("Įveskite antrą skaičių");
        double doubleNum2 = scanner.nextDouble();

        double result = doubleNum1 * doubleNum2;
        System.out.println("Rezultatas: " + result);


    }
}
