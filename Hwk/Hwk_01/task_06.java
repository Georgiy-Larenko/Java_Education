package Hwk.Hwk_01;

import java.util.Arrays;

// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

public class task_06 {
    public static void main(String[] args) {
       
    int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
    ChangeArray(array);
    System.out.println(Arrays.toString(array));

    }

    private static void ChangeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
                
            }
        }
    }

    
}
