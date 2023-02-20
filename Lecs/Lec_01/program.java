package Lecs.Lec_01;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        short age = 10;                     // Сначала объявляем тип (short) после имя переменной (age) и присваеваем знчение переменной       
        int salary = 1234567;
        System.out.println(age);            // Снипет "sysout" выводит команду на печать (System.out.println)
        System.out.println(salary);
        System.out.println(Integer.MIN_VALUE);  // integer - тип данных - обертка (для строгой типизации)

        float e = 2.7f;                     // Для вещественного типа Float при присваивании обязательно добавляем суффикс "f"
        // double pi = 3.1415;              // Для Double есть суффикс "d", но он не является обязательным 
        System.out.println(e);
        // System.out.println(pi);

        char ch = '{';                      // Тип символ (char) указывается в ОДИНАРНЫХ ковычках
        System.out.println(ch);

        boolean flag1 = 123 <= 234;         // Булево пишется как boolean. Вспомнить операторы И ИЛИ
        System.out.println(flag1);

        String msg = "hello, world!";       // Строка указывается в ДВОЙНЫХ ковычках
        System.out.println(msg);

        var i = 123;                        // Неявная типизация
        System.out.println(i);

        // Операции 

        // Присваивание: =
        // Арифметические: *, /, +, -, %, ++, --
        // Операции сравнения: <, >, ==, !=, >=, <=
        // Логические операции: ||, &&, ^, !
        // Побитовые операции <<, >>, &, |, ^

        // Виды спецификаторов
        
        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00
    }
    
}

