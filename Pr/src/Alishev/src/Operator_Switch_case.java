package Alishev.src;

import java.util.Scanner;

public class Operator_Switch_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scan.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошёл в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
        }
//                                    с String


            String  ageSring = scan.nextLine();
            switch (ageSring) {
                case "Ноль" :
                    System.out.println("Ты родился");
                    break;
                case "Семь" :
                    System.out.println("Ты пошёл в школу");
                    break;
                case "Восемнадцать" :
                    System.out.println("Ты закончил школу");
                    break;


        }



}}
