package lt.sdaacademy.control_flow.switch_case;

import java.util.Scanner;

//Pr. P. T.
//Naudotojas iveda dienos raide e.g. Pr, A, T...
//Programa turi atspaudinti pilna dienos pavadinima
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite dienos pirmąją raidę");
        String dayName = scanner.nextLine();

        switch (dayName) {
            case "Pr": {
                System.out.println("Pirmadienis");
                break;
            }
            case "T": {
                System.out.println("Trečiadienis");
                break;
            }
            case "P": {
                System.out.println("Penktadienis");
                break;
            }
            default: {
                System.out.println("Unknow");
            }

        }

    }
}
