package Sems.sem03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Создать список рандрмных целых чисел от 0 до 100 (20 чисел)
// Отсортировать
// Вывести на экран

public class task01 {
    public static void main(String[] args) {
        Random rnd = new Random(100);

        ArrayList <Integer> myList = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            myList.add(rnd.nextInt(100));
        }
        System.out.println("Not sorted list");
        System.out.println(myList.toString());
        
        // myList.sort(null);
        Collections.sort(myList);
        System.out.println("Sorted list");
        System.out.println(myList.toString());
    }    
}
