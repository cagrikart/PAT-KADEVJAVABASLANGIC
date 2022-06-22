package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double fiyat, kdv=0.18,kdvliFiyat ,kdv2 = 0.8,azKdvFiyat;
       Scanner input = new Scanner(System.in);
       System.out.println(" fiyat");

       fiyat = input.nextDouble();
        if (fiyat > 0 && fiyat <1000){
            kdvliFiyat = fiyat + (fiyat * kdv);
            System.out.println("kdvli fiyat " +kdvliFiyat);

        }
        if (fiyat >=  1000) {
            azKdvFiyat = fiyat + (fiyat * kdv2);
            System.out.println("kdvli fiyat " +azKdvFiyat);

        }



        
    }
}
