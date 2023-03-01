package Hwk.Hwk05;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// парсим текст на слова
// печатаем слова в порядке возрастания длины

public class task02 {
    public static void main(String[] args) {
        textUpdate("Парсим текст на слова и печатаем слова в порядке возрастания длины");
    }

    private static void textUpdate(String text) {
        String[] words = text.split(" ");
        Map <String, Integer> repeats = new HashMap<>();                //Создаем Map для хранения одинаковых слов (ключ-слово, value-количество повторений)
        
        for (int i = 0; i < words.length - 1; i++) {
            if (!words[i].isEmpty()) {                                  // Если нет пустых значений

                for (int j = i + 1; j < words.length; j++) {
                    if (!words[i].equalsIgnoreCase(words[j])) {
                        if (words[i].length() != words[j].length()) {   // Пузырьковая сортировка по длине
                            if (words[i].length() < words[j].length()) {
                                String temp = words[i];
                                words[i] = words[j];
                                words[j] = temp;
                            }
                        } else {
                            int countI = 0;                             // Количество гласных букв в первом слове
                            int countJ = 0;                             // Количество гласных букв во втором слове
                            Pattern p = Pattern.compile("[яыуаиеоюэЯЫУАИЕОЮЭ]");
                            Matcher m = p.matcher(words[i]);
                            while (m.find()) {
                                countI++;
                            }
                            m.reset(words[j]);
                            while (m.find()) {
                                countJ++;
                            }
                            if (countI > countJ) {                      // Сравнивает слова по количеству гласных букв
                                String temp = words[i];
                                words[i] = words[j];
                                words[j] = temp;
                            }
                        }
                    } else {
                        words[j] = "";                                  // Если слова равны, то заменяем на пустое повторяющееся слово
                        if (repeats.containsKey(words[i])) {            // Проверка на наличие повторяющегося слова в MapValues
                            repeats.put(words[i], repeats.get(words[i]) + 1);
                        } else {
                            repeats.put(words[i], 2);
                        }

                    }
                }
            }

        }
        System.out.println("Отсортированные слова: ");
        int col = 1;
        for (String word : words) {                                     // Вывод отсортированных слов
            if (!word.isEmpty()) {                                      // Не выводим пустые значения
                if (repeats.containsKey(word)) {                        // Если слово для вывода содержится в MapValues, то выводим его с количеством повторений
                    System.out.print(word.concat("(").concat(repeats.get(word).toString()).concat(") "));
                } else {
                    System.out.print(word.concat(" "));
                }
                col++;
                if (col % 16 == 0) {                                    // Вывод слов в 16 колонок
                    System.out.println("");
                }
            }

        }
    }
}

