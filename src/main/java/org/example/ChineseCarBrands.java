package org.example;

public class ChineseCarBrands {
    void chineseCarBrands() throws java.io.IOException {
        char choice;

        do {
            System.out.println("Допалнительная информация ");
            System.out.println(" 1. Brilliance");
            System.out.println(" 2. BYD");
            System.out.println(" 3.Changan");
            System.out.println("4. Exeed");
            System.out.println("5 DongFeng");
            System.out.println("6 Chery");
            System.out.println("7 FAW");
            System.out.println("8 Foton");
            System.out.println("9 GAC");
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
