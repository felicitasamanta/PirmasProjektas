package lt.sdaacademy.input_output;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("printl atspausdina pranešimą ir žymeklį nukelia į sekančią eilutę");
        System.out.print("print atspausdina pranešimą ir žymeklį palieka toje pačioje eilutėje \n");

        System.out.printf("printf atspausdina %s pranešimą su formatu \n", "mano");

        int decimalValue = 10;
        System.out.printf("....arba skaičių: %d", decimalValue);

        double floatingPointValue = 15.4578;
        System.out.printf("...arba apvalinti reikšmes: %.1f", floatingPointValue);

        String text = "dinamiškai";
        System.out.printf("...arba viską kartu: %f %s %d", floatingPointValue, text, decimalValue);

    }
}
