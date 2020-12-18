package lt.sdaacademy.object_oriented.room;

import java.util.Scanner;

public class RoomMainReFactored {
    public static void main(String[] args) {
        Room room = new Room();

        room.length = getRoomParameter("Įveskite kambario ilgį");
        room.width = getRoomParameter("Įveskite kambario plotį");

        System.out.println("Kambario plotas: " + calculateRoomSquare(room));

    }
    public static double getRoomParameter(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextDouble();

    }

    public static double calculateRoomSquare(Room room) {
        return room.length * room.width;
    }
}
