package Hwk.Hwk04;

import java.util.ArrayList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:

// Принимает от пользователя строку вида
// text~num

// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

// // text~num (например, word~4)
// // print~num (распечатать текст)

// // word~1
// // foo~5
// // qwerty~10
// // bar~5
// // print~10 -> qwerty
// // print~1 -> word
// // print~2 -> пустая строка или исключение NoSuchElementException
// // print~5 -> bar

public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> resulList = new ArrayList<>();
        int arrSize = 100;
        
        for (int i = 0; i < arrSize; i++) {
            resulList.add(" ");    
        }
      
        Boolean run = true;

        while (run) {

            String text = sc.nextLine();
        
            if (text.toLowerCase().equals("stop")) {
                run = false;
            } 
            
            else if (text.toLowerCase().equals("toscreen")) {
                System.out.println(resulList.toString());     
            }
            else if (text.toLowerCase().contains("print")){
                String[] split = text.split("~");
                String numberString = split[1];
                int indexNumber = Integer.parseInt(numberString);
                System.out.println(resulList.get(indexNumber));
            }

            else {
                String[] split = text.split("~");
                String word = split[0];
                String numberString = split[1];
                int indexNumber = Integer.parseInt(numberString);
                resulList.add(indexNumber, word); 
            }

        }

        sc.close();

    }
}
