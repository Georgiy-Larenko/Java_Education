package Sems.sem06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class task01 {

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.

2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
значений в данном массиве и верните его в виде числа с плавающей запятой.

Для вычисления процента используйте формулу:

процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
*/

    public static void main(String[] args) {
        int arrSize = 50;
        int [] arr = new int[arrSize];

        fillArray(arr);

        System.out.println(uniqueStat(arr));
        System.out.println(uniqueStat(arr).size() * 100.0 / arrSize + "%");     
    }

    private static void fillArray(int[]arr) {
        for (int i = 0; i < Array.getLength(arr); i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(25);   
        }
    }

    private static Set uniqueStat(int [] array) {
        Set <Integer> set = new HashSet<>();
        Set <Integer> tempSet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if(set.contains(array[i])){
                tempSet.add(array[i]);
            }
            else {
                set.add(array[i]);
            }
        }

        set.removeAll(tempSet);
        return set;


    }


           
        
}
