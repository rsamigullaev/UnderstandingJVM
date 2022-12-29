
public class JvmComprehension {
    // Класс JvmComprehension записывем в систему ClassLoader, далее переходит в Metaspace для сохранения данных класса.
    public static void main(String[] args) { // Создается фрейм в Stack. Начинает работать Garbage Collector.
        int i = 1;                      // 1 Во фрейме main создаем переменную i равную 1.
        Object o = new Object();        // 2 В Куче создаем объект Object и в main создается переменная o, с присваиванием ссылки на этот объект.
        Integer ii = 2;                 // 3 В Куче создаем объект Integer со значением 2, в main - переменная ii со ссылкой на этот объект.
        printAll(o, i, ii);             // 4 В Stack создаем фрейм printAll, в нем записываем переменные Object o, int i и Integer ii.
        System.out.println("finished"); // 7 В Stack создаем фрейм println, которому передается ссылка на созданный в Куче объект String со значением "finished".
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 В Куче создаем объект Integer со значением 700, а во фрейме printAll переменную uselessVar с ссылкой на этот объект.
        System.out.println(o.toString() + i + ii);  // 6 В Stack создаем фрейм println, и передаем ссылки на Object o, int i и Integer ii. В Stack запускаем фрейм toString.
    }
}
