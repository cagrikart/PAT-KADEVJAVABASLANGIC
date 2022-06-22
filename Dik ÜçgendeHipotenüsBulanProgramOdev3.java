   package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int kenar1 , kenar2  ;
    double hipotenüs ,u,cevre,alan;
    Scanner input = new Scanner(System.in);
    System.out.println("kenar 1 al ");
    kenar1 = input.nextInt();
    System.out.println("kenar 2 al ");
    kenar2 = input.nextInt();
     hipotenüs = Math.sqrt((kenar1 * kenar1) +( kenar2*kenar2));
    System.out.println("hipotenüs : "+hipotenüs);

    u = (kenar1+kenar2+hipotenüs) /2 ;
    cevre = 2*u;
    System.out.println("u : 9" +u+ "and "+ "cevre : "+cevre);

    alan = Math.sqrt(u * (u - kenar1)* (u - kenar2) * (u - hipotenüs));

    System.out.println(alan);













    }
}
