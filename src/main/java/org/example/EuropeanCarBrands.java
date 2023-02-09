package org.example;

public class EuropeanCarBrands {
    void europeanCarBrands() throws java.io.IOException {
        char choice;

        do {
            System.out.println("Допалнительная информация ");
            System.out.println(" 1. Alfa Romeo");
            System.out.println(" 2. Aston Martin");
            System.out.println(" 3.Bentley");
            System.out.println("4. DS");
            System.out.println("5 Citroen");
            System.out.println("6 Bugatti");
            System.out.println("7 Ferrari");
            System.out.println("8 Fiat");
            System.out.println("9 Jaguar");
            System.out.println("выберете вариант");


            choice = (char) System.in.read();
        }
        while (choice< '1' || choice > '6' );
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
