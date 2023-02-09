package org.example;

public class KoreanCarBrands {
    void koreanCarBrands() throws java.io.IOException {
    char choice;

    do {
        System.out.println("Допалнительная информация ");
        System.out.println(" 1. Daewoo"+" :стоит 900000");
        System.out.println(" 2. Kia"+" :стоит 1000000");
        System.out.println(" 3.Genesis"+" :стоит 1100000");
        System.out.println("4.SsangYong"+" :стоит 1200000");
        System.out.println("5 Hyundai"+" :стоит 1300000");

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





    }
}
}
