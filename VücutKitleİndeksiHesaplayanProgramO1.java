   package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo,endeks;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (m cinsinden) giriniz");
        boy = input.nextDouble();
        System.out.println("kilonuzu giriniz ");
        kilo = input.nextDouble();
        endeks = kilo/(boy*boy);
        System.out.println("Vücüt kütle endeksi " +endeks);

    }
}
