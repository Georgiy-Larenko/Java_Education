package Sems.sem04;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class task02 {

    // 1. Принимает от пользователя и “запоминает” строки.
    // 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    // 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
    // */
    // // foo
    // // bar
    // // buzz
    // // print -> [buzz, bar, foo]
    // // revert
    // // print -> [bar, foo]

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Deque<String> queue = new ArrayDeque<String>();

        Boolean run = true;
        while (run) {
            String word = sc.nextLine();
            if (word.toLowerCase().equals("print")) {
                System.out.println(queue.toString());
            } else if (word.toLowerCase().equals("revert")) {
                queue.pollFirst();
            }
            else if (word.toLowerCase().equals("stop")) {
                run = false;
            }
            else {
                queue.addFirst(word);
            }
            
        }
        sc.close();
    }
}
