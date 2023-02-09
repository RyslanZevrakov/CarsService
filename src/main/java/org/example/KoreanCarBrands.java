package org.example;

public class KoreanCarBrands {
    void koreanCarBrands() throws java.io.IOException {
    char choice;
        Money money = new Money();
        double many = money.clientsMoney;
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
            if (many>=900000){

                many=many-900000;
                System.out.println("Оставщиеся деньги "+ many);
            }
            else {
                System.out.println("Денег нет");
            }


            break;
        case '2':
            if (many>=1000000){

                many=many-1000000;
                System.out.println("Оставщиеся деньги "+ many);
            }
            else {
                System.out.println("Денег нет");
            }


            break;
        case '3':
            if (many>=1100000){

                many=many-1100000;
                System.out.println("Оставщиеся деньги "+ many);
            }
            else {
                System.out.println("Денег нет");
            }
            break;
        case '4':
            if (many>=1200000){

                many=many-1200000;
                System.out.println("Оставщиеся деньги "+ many);
            }
            else {
                System.out.println("Денег нет");
            }

            break;
        case '5':
            if (many>=1300000){

                many=many-500000;
                System.out.println("Оставщиеся деньги "+ many);
            }
            else {
                System.out.println("Денег нет");
            }

            break;





    }
}
}
