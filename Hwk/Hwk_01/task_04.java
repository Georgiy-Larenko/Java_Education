package Hwk.Hwk_01;

// Проверить, является ли год високосным. если да - return true

public class task_04 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2023));
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) return true;
        else return false;
    }

}
