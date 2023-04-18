public class Lesson_17_Parametr_Methods {
    public static void main(String[] args) {

        Prison1 prison1 = new Prison1(); // Из-за того что в уроке16 было точно такое же название метод
        prison1.setName("Рома");
        String str = "Вова";
        prison1.setName(str);

    }
}

class Prison1 {
    String name;
    int age;

    void setName(String username) { // (Эти скобки называется параметр)
        name = username;
    }
    //5:48
}




