package lt.sdaacademy.object_oriented.car;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Įveskiteė automobilio modelį");
        String model = scanner.nextLine();

        System.out.println("Įveskite variklio tūrį");
        double engine = scanner.nextDouble();

        System.out.println("Įveskite durų kiekį");
        int doors = scanner.nextInt();

        System.out.println("Ar automobilis važiuoja?");
        boolean isRunAndDrive = scanner.nextBoolean();

        Car carObject = new Car(model, engine, doors, isRunAndDrive);
        Car carObjects1 = new Car(model, doors);

        System.out.println(carObject.getEngine());





    }
}
