package lt.sdaacademy.arrays;

public class Example5 {
    public static void main(String[] args) {
        int[][] table = new int[3][2];

        // pirma eilute
        table[0][0] = 5; // pirmas stulpelis
        table[0][1] = 7; // antras stulpelis

        // antra eilute
        table[1][0] = 10;
        table[1][1] = 17;

        // trecia eilute
        table[2][0] = 561;
        table[2][1] = -5;

        for (int n = 0; n < 3; n++) {
            for (int m = 0; m < 2; m++) {
                System.out.print(table[n][m] + " ");
            }
            System.out.println();
        }

    }
}