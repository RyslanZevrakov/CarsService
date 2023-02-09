package org.example;

public class JapaneseCarBrands {
    void japanseCarBrands() throws java.io.IOException {
        char choice;

        do {
            System.out.println("Допалнительная информация ");
            System.out.println(" 1. Acura"+" :стоит 500000");
            System.out.println(" 2. Daihatsu"+" :стоит 600000");
            System.out.println(" 3. Datsun"+" :стоит 700000");
            System.out.println("4. Honda"+" :стоит 800000");
            System.out.println("5 Infiniti"+" :стоит 900000");
            System.out.println("6 Isuzu"+" :стоит 1000000");
            System.out.println("7 Lexus "+" :стоит 1100000");
            System.out.println("8 Mazda"+" :стоит 1200000");
            System.out.println("9 Mitsubishi"+" :стоит 1300000");
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
