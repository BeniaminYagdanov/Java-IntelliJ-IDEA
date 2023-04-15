package Alishev.src;
public class Operator_Break {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Введите 10 разных чисел");
        while (true) {
            if (num ==10) {
                break;
            }
            System.out.println(num);
            num++;
        }
        System.out.println("ВЫ вышли из цикл");
    }
}
