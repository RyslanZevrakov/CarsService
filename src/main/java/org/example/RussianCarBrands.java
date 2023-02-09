package org.example;

public class RussianCarBrands {
    void russianCarBrands() throws java.io.IOException {
        char choice;

        do {
            System.out.println("Допалнительная информация ");
            System.out.println(" 1. Aurus");
            System.out.println(" 2. Москвич");
            System.out.println(" 3.Lada");
            System.out.println("4.ТагАЗ");
            System.out.println("5 ГАЗ");
            System.out.println("6 УАЗ");

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
