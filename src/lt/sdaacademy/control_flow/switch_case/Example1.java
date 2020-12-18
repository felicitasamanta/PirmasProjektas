package lt.sdaacademy.control_flow.switch_case;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // Case sensitine - yra kreipiamas demesis i didziasas ir mazasias raides
        Scanner scanner = new Scanner(System.in);

        System.out.println("Įveskite pasaulio kryptį!");
        String direction = scanner.nextLine();

        switch (direction) {

            case ("N"): {
                System.out.println("North");
                break;
            }
            case "S": {
                System.out.println("South");
                break;
            }
            case "E": {
                System.out.println("East");
                break;
            }
            case "W": {
                System.out.println("West");
                break;
            }
            default: {
                System.out.println("Unknow");
            }

        }

    }
}