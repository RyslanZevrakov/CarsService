package org.example;

import java.util.Scanner;

public class RussianCarBrands {
    void russianCarBrands() throws java.io.IOException {
        char choice;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Допалнительная информация ");
            System.out.println(" 1. Aurus"+" :стоит 800000");
            System.out.println(" 2. Москвич"+" :стоит 900000");
            System.out.println(" 3.Lada"+" :стоит 1000000");
            System.out.println("4.ТагАЗ"+" :стоит 1100000");
            System.out.println("5 ГАЗ"+" :стоит 1200000");
            System.out.println("6 УАЗ"+" :стоит 1300000");

            System.out.println("выберете вариант");


            choice = (char) System.in.read();
        }

        while (choice< '1' || choice > '6' );
        System.out.println("\n");
        System.out.println("Введите каличестов ваших средств");
        double clientsMoney=scanner.nextDouble();
        switch (choice){
            case '1':
                if (clientsMoney>=800000){

                    clientsMoney=clientsMoney-800000;
                    System.out.println("Оставщиеся деньги "+ clientsMoney);
                }
                else {
                    System.out.println("Денег нет");
                }


                break;
            case '2':
                if (clientsMoney>=900000){

                    clientsMoney=clientsMoney-900000;
                    System.out.println("Оставщиеся деньги "+ clientsMoney);
                }
                else {
                    System.out.println("Денег нет");
                }

                break;
            case '3':
                if (clientsMoney>=1000000){

                    clientsMoney=clientsMoney-1000000;
                    System.out.println("Оставщиеся деньги "+ clientsMoney);
                }
                else {
                    System.out.println("Денег нет");
                }
                break;
            case '4':
                if (clientsMoney>=1100000){

                    clientsMoney=clientsMoney-1100000;
                    System.out.println("Оставщиеся деньги "+ clientsMoney);
                }
                else {
                    System.out.println("Денег нет");
                }

                break;
            case '5':
                if (clientsMoney>=1200000){

                    clientsMoney=clientsMoney-1200000;
                    System.out.println("Оставщиеся деньги "+ clientsMoney);
                }
                else {
                    System.out.println("Денег нет");
                }

                break;
            case '6':
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
