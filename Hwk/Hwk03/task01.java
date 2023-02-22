package Hwk.Hwk03;

import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

public class task01 {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList <Integer> myList = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            myList.add(rnd.nextInt(100));
        }

        System.out.println("Current list");
        System.out.println(myList.toString());

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                myList.remove(i);
            }
        }

        System.out.println("Update ist");
        System.out.println(myList.toString());


    } 

}
