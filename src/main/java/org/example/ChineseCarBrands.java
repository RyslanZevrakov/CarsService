package org.example;

public class ChineseCarBrands {
    void chineseCarBrands() throws java.io.IOException {
        char choice;
        Money money = new Money();
        double many = money.clientsMoney;
        do {
            System.out.println("Допалнительная информация ");
            System.out.println(" 1. Brilliance"+" :стоит 500000");
            System.out.println(" 2. BYD"+" :стоит 600000");
            System.out.println(" 3.Changan"+" :стоит 700000");
            System.out.println("4. Exeed"+" :стоит 800000");
            System.out.println("5 DongFeng"+" :стоит 900000");
            System.out.println("6 Chery"+" :стоит 1000000");
            System.out.println("7 FAW"+" :стоит 1100000");
            System.out.println("8 Foton"+" :стоит 1200000");
            System.out.println("9 GAC"+" :стоит 1300000");
            System.out.println("выберете вариант");


            choice = (char) System.in.read();
        }
        while (choice< '1' || choice > '6' );
        System.out.println("\n");
        switch (choice){
            case '1':
                if (many>=500000){

                    many=many-500000;
                    System.out.println("Оставщиеся деньги "+ many);
                }
                else {
                    System.out.println("Денег нет");
                }

                break;
            case '2':
                if (many>=600000){

                    many=many-600000;
                    System.out.println("Оставщиеся деньги "+ many);
                }
                else {
                    System.out.println("Денег нет");
                }


                break;
            case '3':
                if (many>=700000){

                    many=many-700000;
                    System.out.println("Оставщиеся деньги "+ many);
                }
                else {
                    System.out.println("Денег нет");
                }
                break;
            case '4':
                if (many>=800000){

                    many=many-800000;
                    System.out.println("Оставщиеся деньги "+ many);
                }
                else {
                    System.out.println("Денег нет");
                }

                break;
            case '5':
                if (many>=900000){

                    many=many-900000;
                    System.out.println("Оставщиеся деньги "+ many);
                }
                else {
                    System.out.println("Денег нет");
                }

                break;
            case '6':
                if (many>=1000000){

                    many=many-1000000;
                    System.out.println("Оставщиеся деньги "+ many);
                }
                else {
                    System.out.println("Денег нет");
                }
                break;
            case '7':
                if (many>=1100000){

                    many=many-1100000;
                    System.out.println("Оставщиеся деньги "+ many);
                }
                else {
                    System.out.println("Денег нет");
                }
                break;
            case '8':
                if (many>=1200000){

                    many=many-1200000;
                    System.out.println("Оставщиеся деньги "+ many);
                }
                else {
                    System.out.println("Денег нет");
                }
                break;
            case '9':
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
