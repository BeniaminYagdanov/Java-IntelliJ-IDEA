package Alishev.src;
public class Operator_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 16; i++) {
            if (i%2 == 0) { // Запомнить как выводить целые числа
                continue;
            }
            System.out.println("Это не чётное число");

        }
    }
}
