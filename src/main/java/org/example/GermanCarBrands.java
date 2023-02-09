package org.example;

public class GermanCarBrands {
    void germanCarBrands() throws java.io.IOException {
        char choice;

        do {
            System.out.println("Допалнительная информация ");
            System.out.println(" 1. Audi");
            System.out.println(" 2. Opel");
            System.out.println(" 3.BMW");
            System.out.println("4. Porsche");
            System.out.println("5 Mercedes-Benz");
            System.out.println("6 Volkswagen");
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




        }
    }
}
