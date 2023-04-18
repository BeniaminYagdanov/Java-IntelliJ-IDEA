public class Lesson_16 {
    public static void main(String[] args) {
//        void - Возвращает ничего в метод main
        Prison prison = new Prison(); // Объявили
        int years2 = prison.calcusLateYearsToRetReturned(); // В эти переменные помещаем значение
        System.out.println("Первому человеку до пенсии: " + years2);
    }
}

class Prison {
    String name;
    int age;

    int calcusLateYearsToRetReturned() {
        int years = 65 - age;
        System.out.println("Количество лет до пенсии " + years); // Теперь нужно вызвать метод
        return years;
    }

    int calcusLateYearsToRetReturned2() {
        int years2 = 65 - age;
        return years2; // Возвращает кол-во лет

//* return - возвращение значения, идёт последний в методе
    }
}


