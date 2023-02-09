package org.example;

public class AmericanCarBrands {
    void americanCarBrands() throws java.io.IOException {
        char choice;

        do {
            System.out.println("Допалнительная информация ");
            System.out.println(" 1. Buick");
            System.out.println(" 2. Cadillac");
            System.out.println(" 3. Chevrolet");
            System.out.println("4. Ford");
            System.out.println("5 Dodge");
            System.out.println("6 Chrysler");
            System.out.println("7 GMC ");
            System.out.println("8 Hummer");
            System.out.println("9 Jeep");
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
