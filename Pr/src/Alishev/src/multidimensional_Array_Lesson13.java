package Alishev.src;

public class multidimensional_Array_Lesson13 {
    public static void main(String[] args) {
//        Одномерный массив представляет собой последовательность чисел
        int[] number = {1, 23, 4, 3};
        System.out.println(number[1]);
//        Двумерный массив представляет собой таблицу
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(matrice[2][2]);// Первое отвечает за строку второе за столбец
        System.out.println(matrice[0][1]); // то бишь столбец нулевой и 2 это 0, 1
        System.out.println(matrice[2][1]);

        int[] number1 = new int[5];
        String[][] str = new String[2][3];
        str[0][0] = "Привет мир";
        System.out.println(str[0][0]);
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.println(matrice[i][j] + "");
            }
            System.out.println(); // После выхода из цикла числа будут выводиться с новой строки
            
        }

    }
}
