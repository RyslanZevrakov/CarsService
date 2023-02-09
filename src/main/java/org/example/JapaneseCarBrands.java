package org.example;

public class JapaneseCarBrands {
    void japanseCarBrands() throws java.io.IOException {
        char choice;

        do {
            System.out.println("Допалнительная информация ");
            System.out.println(" 1. Acura");
            System.out.println(" 2. Daihatsu");
            System.out.println(" 3. Datsun");
            System.out.println("4. Honda");
            System.out.println("5 Infiniti");
            System.out.println("6 Isuzu");
            System.out.println("7 Lexus ");
            System.out.println("8 Mazda");
            System.out.println("9 Mitsubishi");
            System.out.println("выберете вариант");


            choice = (char) System.in.read();
        }
        while (choice< '1' || choice > '9' );
        System.out.println("\n");
        switch (choice){
            case '1':
                System.out.println("\n");


                break;
            case '2':
                System.out.println("\n");


                break;
            case '3':
                System.out.println("\n");
                break;
            case '4':
                System.out.println("\n");

                break;
            case '5':
                System.out.println("\n");

                break;
            case '6':
                System.out.println("\n");

                break;
            case '7':
                System.out.println("\n");

                break;
            case '8':
                System.out.println("\n");

                break;
            case '9':
                System.out.println("\n");
                break;


        }
    }
}
