package lt.sdaacademy.methods;

public class Example1 {
    public static void main(String[] args) {
        methodPrintsText();
        methodDoeslogic();
        int number = methodReturnsIntegerNumber();
        System.out.println(number);

       double sumOfNumbers = methodAcceptsValuesDoesLogicAndReturnsValue( 3, 5.5,  "Metodas priima argumentus, atlieka logika ir grazina rezultatus");
       System.out.println(sumOfNumbers);

    }

    public static void methodPrintsText() {
        System.out.println("Method prints text");
    }

    public static  void methodDoeslogic() {
        for (int i = 0; i < 3; i++) {
            System.out.println("For loop in method");
        }

    }

    public static int methodReturnsIntegerNumber() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;

        }
        return sum;
    }

    public static double methodAcceptsValuesDoesLogicAndReturnsValue(int intNum, double doubleNum, String text ) {
        System.out.println(text);
        double sumOfNumbers = intNum + doubleNum;
        return sumOfNumbers;
    }
}
