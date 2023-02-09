package org.example;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Money {
    Scanner scanner = new Scanner(System.in);
    Dstribution dstribution = new Dstribution();


    void many() throws IOException {
        double clientsMoney=scanner.nextDouble();
        if(clientsMoney>=500000) {
            dstribution.cjp();
        }
        else {
            System.out.println("Вы бидны, ухадите отсёда");
        }
    }
}
