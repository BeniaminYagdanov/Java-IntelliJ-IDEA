package Hacker_rang_Task.src;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
    public class Sum_Massiv {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int a = scan.nextInt();
                int sum = 0;
                for(int i = 0; i < a; i++) {
                    sum += scan.nextInt();
                }
                System.out.println(sum);
            }}// Сделать ограничение в 10 попыток