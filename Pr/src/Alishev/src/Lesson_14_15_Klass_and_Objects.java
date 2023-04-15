package Alishev.src;

public class Lesson_14_15_Klass_and_Objects {
    public static void main(String[] args) {
        /*
          В Java Может любое кол-во классов
          Отличие между public и обычным классом:
           public класс может быть только один,
            а обычных классов может быть много
         */
/*      класс - это шаблон общение понятие со своими объектами
        у класса могут быть:
        1. данные (поля)
        2.Действия, которые он может совершать (методы)
*/

        class Person { // Тип данных который вы сами создали
            String name;
            int age;

        }
        Person person = new Person();
        person.name = "Роман";
        person.age = 50;
        // System.out.println("Меня зовут " + person.name + " И мне " + person.age);

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 39;
        //System.out.println("Меня зовут " + person1.name + " И мне " + person1.age);

//                  Урок 15: Методы в Java.
//        Следующий урок завтра добавить шорткаты с It-proger на shortcat в intelgidea и vs code
        class Speak {
            String name;
            int age;

            void speak() { // - Метод и каждое слово начинаем с большой буквы
                System.out.println("Меня зовут" + name + " Мне " + age + "Лет"); // Ничего не вывелось потому-что метод в классе не вызван
                // Как вызвать метод?
            }

            void SayHello() {
                System.out.println("Привет");
            }
        }
    }
}
