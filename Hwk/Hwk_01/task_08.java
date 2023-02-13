package Hwk.Hwk_01;

// Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

public class task_08 {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        arrayMinMax(array);
    }

    private static void arrayMinMax(int[] array) {

        int min = 0;
        int max = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                min = array[0];
                max = array[0];
            }
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    
}
