package Hwk.Hwk03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

public class task02 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList <Integer> myList = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            myList.add(rnd.nextInt(100));
        }

        System.out.println("Current list: ");
        System.out.println(myList.toString());

        int max = Collections.max(myList);
        int min = Collections.min(myList);
        
        System.out.println("Max value: " + max + "\nMin value: " + min);
        System.out.println("Average: " + average(myList));

    }

    static double average (ArrayList<Integer> list){
        double sum = 0;     
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        
        return sum/list.size();
    }
    
}
