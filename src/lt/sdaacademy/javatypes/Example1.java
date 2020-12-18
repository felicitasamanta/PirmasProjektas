package lt.sdaacademy.javatypes;

public class Example1 {

    public static void main(String[] args) {
        char character = 'r';
        char newline = '\n';
        char tab = '\t';

        System.out.println(character + "\n" + character);

        // Bool data type
        // TODO learn String data type
        boolean boolFalse = false;
        boolean boolTrue = true;

        System.out.println(boolFalse + " " + boolTrue);

        // String data type
        String text = "Labas  rytas!"; //reikšmė saugoma string poole; su text2 uzimtu bendrai tik 16 bytes
        String text2 = "Labas  rytas!";
        String text1 = new String("Labas rytas!"); // reiksme yra saugoma heape. jei butu ir text2 tai jie uzimtu po 16 bytes kiekvienas
        System.out.print(text + text1 ); // String concatination. sudeda du tekstus

        String text3 = new String("Labas rytas!"); // Reiksme yra saugoma heape
        String text4 = new String("Labas rytas!");

        System.out.print(1==1); //lyginami adresai, vieta atmintyje
        System.out.print(text.equals(text2));
        System.out.print(text==text2);
        System.out.print("tekstas" == "text");

        System.out.print("\n"+text3.equals(text4));
        System.out.print(text3 ==text2);

        System.out.println("\n" + text.equals(text2)); //lyginamos reiksmes
        System.out.println(text == text2); //lyginami adresai
        System.out.println("\n" + text3.equals(text4));
        System.out.println(text3 == text4);

        System.out.println("tekstas".toUpperCase()); //atspausdinama didziosiomis

        System.out.println("TEKSTAS".toLowerCase()); //atspausdina mazosiomis
        System.out.println("TEKSTAS YRA TRUMPAS".indexOf("YRA"));
        System.out.println("2020-11-14".replace("-", "."));
        System.out.println("Vienas".length());


        String jokeText = "Hahahah! Funny joke!";
        System.out.println(jokeText.replaceAll("a", "o"));


    }
}
