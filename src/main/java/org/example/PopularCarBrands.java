package org.example;

import java.util.Scanner;

public class PopularCarBrands {
    void popularCarBrands() throws java.io.IOException {
        char choice;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Допалнительная информация ");
            System.out.println(" 1. Audi"+" :стоит 500000");
            System.out.println(" 2. BMW"+" :стоит 600000");
            System.out.println(" 3. Ford"+" :стоит 700000");
            System.out.println("4. Honda"+" :стоит 800000");
            System.out.println("5 Hyundai"+" :стоит 900000");
            System.out.println("6 Kia"+" :стоит 1000000");
            System.out.println("7 Lada "+" :стоит 1100000");
            System.out.println("8 Mazda"+" :стоит 1200000");
            System.out.println("9 Skoda"+" :стоит 1300000");
            System.out.println("выберете вариант");


            choice = (char) System.in.read();
        }
        while (choice< '1' || choice > '9' );
        System.out.println("\n");
        System.out.println("Введите каличестов ваших средств");
        double clientsMoney=scanner.nextDouble();
        switch (choice){
            case '1':
                if (clientsMoney>=500000){

                    clientsMoney=clientsMoney-500000;
                    System.out.println("Оставщиеся деньги "+ clientsMoney);
                }
else {
                    System.out.println("Денег нет");
                }

                break;
            case '2':
                if (clientsMoney>=600000){

                    clientsMoney=clientsMoney-600000;
                    System.out.println("Оставщиеся деньги "+ clientsMoney);
                }
                else {
                    System.out.println("Денег нет");
                }


                break;
            case '3':
                if (clientsMoney>=700000){

                    clientsMoney=clientsMoney-700000;
                    System.out.println("Оставщиеся деньги "+clientsMoney);
                }
                else {
                    System.out.println("Денег нет");
                }
                break;
            case '4':
                if (clientsMoney>=800000){

                    clientsMoney=clientsMoney-800000;
                    System.out.println("Оставщиеся деньги "+ clientsMoney);
                }
                else {
                    System.out.println("Денег нет");
                }

                break;
            case '5':
                 if (clientsMoney>=900000){

                     clientsMoney=clientsMoney-900000;
                System.out.println("Оставщиеся деньги "+ clientsMoney);
            }
            else {
                System.out.println("Денег нет");
            }

                break;
            case '6':
                if (clientsMoney>=1000000){

                    clientsMoney=clientsMoney-1000000;
                    System.out.println("Оставщиеся деньги "+ clientsMoney);
                }
                else {
                    System.out.println("Денег нет");
                }

                break;
            case '7':
                if (clientsMoney>=1100000){

                    clientsMoney=clientsMoney-1100000;
                    System.out.println("Оставщиеся деньги "+ clientsMoney);
                }
                else {
                    System.out.println("Денег нет");
                }

                break;
            case '8':
                if (clientsMoney>=1200000){

                    clientsMoney=clientsMoney-1200000;
                    System.out.println("Оставщиеся деньги "+ clientsMoney);
                }
                else {
                    System.out.println("Денег нет");
                }

                break;
            case '9':
                if (clientsMoney>=1300000){

                    clientsMoney=clientsMoney-500000;
                    System.out.println("Оставщиеся деньги "+ clientsMoney);
                }
                else {
                    System.out.println("Денег нет");
                }
                break;


        }
    }
}
