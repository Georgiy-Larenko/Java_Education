package Sems.sem04;

import java.util.ArrayList;
import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int size = 2000000;


        long start = System.currentTimeMillis();

        ArrayList <Integer> arrlist = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrlist.add(rnd.nextInt(1000));
        }
        long end = System.currentTimeMillis();
        System.out.println("result arrayList: " + (end - start));


        long startlink = System.currentTimeMillis();

        ArrayList <Integer> linklist = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            linklist.add(rnd.nextInt(1000));
        }
        long endlink = System.currentTimeMillis();
        System.out.println("result linkedList: " + (endlink - startlink));
    }
}
