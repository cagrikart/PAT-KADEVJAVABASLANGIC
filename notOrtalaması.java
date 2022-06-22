package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int mat ,fizik,kimya,turkçe,tarih,müzik ;
        System.out.println("matematik notunu giriniz ");
        Scanner input = new Scanner(System.in);
        mat = input.nextInt();
        System.out.println("matematik not  : "+mat );

        System.out.println("fizik notunu giriniz ");
        fizik = input.nextInt();
        System.out.println("matematik not  : "+fizik );

        System.out.println("kimya notunu giriniz ");
        kimya = input.nextInt();
        System.out.println("kimya not  : "+kimya );

        System.out.println("turkçe notunu giriniz ");
        turkçe = input.nextInt();
        System.out.println("turkçe not  : "+turkçe );

        System.out.println("tarih notunu giriniz ");
        tarih = input.nextInt();
        System.out.println("tarih not  : "+tarih );

         System.out.println("müzik notunu giriniz ");
         müzik = input.nextInt();
         System.out.println("tarih not  : "+müzik );

         double ortalama =  (mat +fizik+kimya+turkçe+tarih+müzik )/ 6;
        System.out.println("ortalamanız : " +ortalama);

        String sonuc = (ortalama >= 60) ? "geçtiniz": "kaldınız.";
        System.out.println(sonuc);

    }
}
