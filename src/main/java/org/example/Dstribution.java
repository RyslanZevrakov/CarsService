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
                
                japaneseCarBrands.japanseCarBrands();

                break;
            case '2':

                americanCarBrands.americanCarBrands();

                break;
            case '3':

                russianCarBrands.russianCarBrands();
                break;
            case '4':

                germanCarBrands.germanCarBrands();
                break;
            case '5':

                koreanCarBrands.koreanCarBrands();
                break;
            case '6':

                europeanCarBrands.europeanCarBrands();
                break;
            case '7':

                chineseCarBrands.chineseCarBrands();
                break;
            case '8':
                System.out.println("\n");
                popularCarBrands.popularCarBrands();

                break;


        }
    }
}
