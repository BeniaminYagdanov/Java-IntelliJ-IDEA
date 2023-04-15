package Alishev.src;

public class Array_11Lesson {
    public static void main(String[] args) {
//        char ch = 'a';  //Примитивный тип данных
//        int number = 10; //Примитивный тип данных
        int[] Array = new int[5]; // Здесь мы создаем массив с 5 ячейками    Array -> [Массив] - Это ссылочный тип данных
//        System.out.println(Array[0]); // Отсчёт с 0 1 2 3 4
//                      2 Способа инициализации массива
        Array[0] = 10;
        Array[1] = 20; // 1 Способ если например массив из небольшого кол-ва чисел
        for (int i = 0; i < Array.length; i++) {
            Array[i] = i * 10;
        }
        for (int i = 0; i < Array.length; i++) { // Выводим на экран все элементы под индексом i
            System.out.println(Array[i]);
        }
//             Если я заранее знаю какие числа будут в массиве
        System.out.println(); // Пустая строка, чтобы отделять одно от другого
        int[] num = {1, 3, 4, 5, 3, 42342, 2, 3};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
    }
}


