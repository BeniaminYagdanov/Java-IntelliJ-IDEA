package Alishev.src;

public class Arrays_12Lesson {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 10;
        System.out.println(num[0]);
        System.out.println(num[1]);
//        Массив из строк
        String[] str = new String[3];
        str[0] = "Привет";
        str[1] = "Hello";
        str[2] = "Hi";
        System.out.println(str[0]);
        System.out.println(str[1]);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]); // Цикл будет for проходится по всему индексу массива
        }                // for each - зачем нужен - этот цикл проходится по каждому элементу массива и в теле цикла вы можете что делать с каждым элементом
        for (String st : str) {     // 1 - тип данных, 2 объявление String, 3 - массив через который мы хотим проходить
            System.out.println(st);
//            Пример использования for-each
            int[] nums = {1, 2, 34, 5, 4, 34, 34, 343};
            int sum = 0;
            for (int x : nums) {
                sum = sum + x;
            }
            System.out.println();
            System.out.println(sum);


        }


    }
}
