package Hwk.Hwk_01;

// проверить, что х положительное

public class task_02 {

    public static void main(String[] args) {
        System.out.println(isPositive(5));
        System.out.println(isPositive(-7));
    }

    private static boolean isPositive(int x) {
        if (x >= 0 ) return true;
        else return false;
    }
}
