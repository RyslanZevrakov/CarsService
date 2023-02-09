package org.example;

public class Dstribution {
    public void cjp()
      throws java.io.IOException {
        char choice;
        PopularCarBrands popularCarBrands = new PopularCarBrands();
        JapaneseCarBrands japaneseCarBrands = new JapaneseCarBrands();
        AmericanCarBrands americanCarBrands = new AmericanCarBrands();
        EuropeanCarBrands europeanCarBrands = new EuropeanCarBrands();
        ChineseCarBrands chineseCarBrands = new ChineseCarBrands();
        GermanCarBrands germanCarBrands = new GermanCarBrands();
        KoreanCarBrands koreanCarBrands = new KoreanCarBrands();
        RussianCarBrands russianCarBrands = new RussianCarBrands();
        do {
            System.out.println("Информация");
            System.out.println(" 1. Японские марки авто");
            System.out.println(" 2. Американские марки авто");
            System.out.println(" 3. Российские марки авто");
            System.out.println("4. Немецкие марки авто");
            System.out.println("5 Корейские марки авто");
            System.out.println("6 Европейские марки авто");
            System.out.println("7 Китайские марки авто ");
            System.out.println("8 Популярные марки авто");
            System.out.println("выберете вариант");

            choice = (char) System.in.read();
        }
        while (choice< '1' || choice > '7' );
        System.out.println("\n");
        switch (choice){
            case '1':
                System.out.println("\n");
                japaneseCarBrands.japanseCarBrands();

                break;
            case '2':
                System.out.println("\n");
                americanCarBrands.americanCarBrands();

                break;
            case '3':
                System.out.println("\n");
                russianCarBrands.russianCarBrands();
                break;
            case '4':
                System.out.println("\n");
                germanCarBrands.germanCarBrands();
                break;
            case '5':
                System.out.println("\n");
                koreanCarBrands.koreanCarBrands();
                break;
            case '6':
                System.out.println("\n");
                europeanCarBrands.europeanCarBrands();
                break;
            case '7':
                System.out.println("\n");
                chineseCarBrands.chineseCarBrands();
                break;
            case '8':
                System.out.println("\n");
                popularCarBrands.popularCarBrands();

                break;


        }
    }
}
