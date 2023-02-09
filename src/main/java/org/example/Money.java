package org.example;

import java.io.IOException;
import java.util.Scanner;


public class Money {
    Scanner scanner = new Scanner(System.in);
    Dstribution dstribution = new Dstribution();

    public double clientsMoney=scanner.nextDouble();

    void many() throws IOException {

        if(clientsMoney>=500000) {
            dstribution.cjp();
        }
        else {
            System.out.println("Вы бидны, ухадите отсёда");
        }
    }
}
