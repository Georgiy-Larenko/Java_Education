package Sems.sem05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
Взять набор строк, например, "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись"
Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
*/

public class task02 {
    public static void main(String[] args) {
        sortByLenght("Елена, Добрый день! Возможно, вы использовали колесико мышки после запуска урока...");
    }

    private static void sortByLenght(String text) {

        // парсим текст на слова
        // печатаем слова в порядке возрастания длины

        String[] splitText = text.split(" ");
        Map <Integer, List <String>> db = new TreeMap<>();
        for (String string : splitText) {
            List <String> temp = new ArrayList <String>();

            if (db.containsKey(string.length())) {
                temp = db.get(string.length());
            }

            temp.add(string);
            db.putIfAbsent(string.length(), temp);
        }

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}
