package lt.sdaacademy.arrays;

public class Example2 {
    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 5555, 987};
        System.out.println(arrayOfInts [4]);
        System.out.println(arrayOfInts [3]);
        System.out.println(arrayOfInts [1]);

        System.out.println("Array size: " + arrayOfInts.length); // duoda masyvo dydi
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.println(arrayOfInts[i] + " ");
        }

    }
}
