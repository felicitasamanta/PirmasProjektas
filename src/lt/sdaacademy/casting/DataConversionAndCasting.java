package lt.sdaacademy.casting;

public class DataConversionAndCasting {
    public static void main(String[] args) {
        //byte 8 bits
        //short 16 bytes
        //int 4 bytes
        //long 8 bytes
        //konvertuoti is didesnio i mazesni negalima, nes bus prarandami duomenys
        byte byteNum;
        short shortNum = 12;
        int intNum;
        long longNum = 12314658L;

        //byteNum = longNum; //negalima
        //intNum = longNum; //negalima
        intNum = shortNum; //negalima

        int intNum1 = 1110;
        byte shortNum1;
        shortNum =(byte) intNum1; // duomenu tipo castinimas
        System.out.println(shortNum); //duomenu praradimas

        // float 4 bytes
        // double 8 bytes
        float floatNum = 15.78F;
        double doubleNum = 50;

        // floatNum = doubleNum; // is didesnio i mazesni castinimas (be duomenu praradimo)
        System.out.println(doubleNum);
        doubleNum = floatNum;
        System.out.println(doubleNum);

        floatNum = (float) doubleNum; //duomenu kastinimas
        System.out.println(floatNum);
    }
}
