package lt.sdaacademy.calculator;

//Naudotojas klaviatura iveda 2 skaicius ir veiksma
//Programa turi atspausdinti atlikto veiksmo rezultata

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //skirtas veiksmui nuskaityti
        Scanner numberScanner = new Scanner(System.in); //skaiciams nuskatyti

        System.out.println("Įveskite pirmą skaičių");
        int num1 = numberScanner.nextInt();

        System.out.println("Įveskite antrą skaičių");
        int num2 = numberScanner.nextInt();

        System.out.println("Įveskite veiksmą");
        String action = scanner.nextLine();
        switch (action) {
            case ("+"): {
                System.out.println(num1 + num2);
                break;
            }
            case ("/"): {
                System.out.println(num1 / num2);
                break;
            }
            case ("*"): {
                System.out.println(num1 * num2);
                break;
            }
            case ("-"): {
                System.out.println(num1 - num2);
                break;
            }
        }




    }
}
