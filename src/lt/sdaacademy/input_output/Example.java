package lt.sdaacademy.input_output;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // kaireje - objektas, kurio pagqalba galima nuskaityti duomenis is klaviaturos. desineje - naudojamas konstruktorius, naudotojo ivestis

        System.out.println("Koks jūsų vardas?");
        String name = scanner.nextLine(); //kaireje - kintamasis name, kuris laiko su klaviatura ivesta varda
        System.out.println("Sveiki, " + name);

        System.out.println("Galiu sudėti 2 int tipo skaičius");
        System.out.println("Įveskite pirmą skaičių");
        int firstNum = scanner.nextInt(); //bus grazinamas pirmas naudotojo ivestas sveikas skaicius
        System.out.println("Įveskite antrą skaičių");
        int secondNum = scanner.nextInt();

        int result = firstNum + secondNum;

        System.out.println("Rezusltatas: " + result);


    }
}
