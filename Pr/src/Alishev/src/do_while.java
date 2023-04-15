package Alishev.src;

import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
        // Урок 8 цикл do-while
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи 5"); // <--Здесь цикл повторяется 1
        int value = scan.nextInt();    // <--Здесь цикл повторяется 1
        while (value!=5) {
            System.out.println("Введи 5"); //<--Здесь цикл повторяется 2
            value = scan.nextInt();        //<--Здесь цикл повторяется 2
        }
        System.out.println("Вы ввели 5 ");
        // Цикл с использованием do-while
        int doo = scan.nextInt();
        do {System.out.println("Введи 5");}
        while (doo!=5); //При do-while мы закрываем цикл ;
//            System.out.println("Вы ввели " + doo);

        }
    }
