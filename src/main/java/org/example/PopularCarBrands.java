package org.example;

public class PopularCarBrands {
    void popularCarBrands() throws java.io.IOException {
        char choice;

        do {
            System.out.println("Допалнительная информация ");
            System.out.println(" 1. Audi");
            System.out.println(" 2. BMW");
            System.out.println(" 3. Ford");
            System.out.println("4. Honda");
            System.out.println("5 Hyundai");
            System.out.println("6 Kia");
            System.out.println("7 Lada ");
            System.out.println("8 Mazda");
            System.out.println("9 Skoda");
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
