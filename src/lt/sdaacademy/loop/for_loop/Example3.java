package lt.sdaacademy.loop.for_loop;

public class Example3 {
    public static void main(String[] args) {
        // i = 0 bus vykdoma
        // i = 1 continue i = i + 1
        // i = 2 bus vykdomas
        for (int i =0; i < 3; i = i + 1) {
            if (i == 1) {
                continue; // i = i + 1, i = 2
            }
            System.out.println(" Continue example " + i);
        }
        for (int i = 0; i < 4; i++) {
            if (i == 1) {
                break; // nutraukia cikla
            }
            System.out.println(" Break example: " + i);
        }
        // continue - persoka per viena ciklo interacija
        // break - nutraukia ciklo vykdyma

        for (int  i = 0; i < 10; i++ ) {
            if ( i == 2 || i == 5) {
                continue;
            }
            System.out.println("Continue exmple: " + i);
        }
    }
}
