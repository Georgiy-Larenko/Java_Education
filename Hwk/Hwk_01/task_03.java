package Hwk.Hwk_01;

// Написать метод, которому в качестве параметра передается строка и число. метод должен отпечатать в консоль указанную строку указанное количество раз

public class task_03 {
    public static void main(String[] args) {
        printString("abcd", 5); // abcdabcdabcdabcdabcd
    }

    private static void printString(String source, int repeat) {
        var result = source.repeat(repeat);
        System.out.println(result);
    }
}
