package org.example;

public class KoreanCarBrands {
    void koreanCarBrands() throws java.io.IOException {
    char choice;

    do {
        System.out.println("Допалнительная информация ");
        System.out.println(" 1. Daewoo");
        System.out.println(" 2. Kia");
        System.out.println(" 3.Genesis");
        System.out.println("4.SsangYong");
        System.out.println("5 Hyundai");

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
