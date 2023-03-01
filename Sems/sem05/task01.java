package Sems.sem05;

import java.util.HashMap;
import java.util.Map;

/**
* (foo, bar) -> false
* (paper, title) -> true
* (add, egg) -> true
* (abcde, bcdef) -> true
* Каждому символу первого слова может соответствовать только 1 символ второго слова
*/


public class task01 {
    public static void main(String[] args) {
        System.out.println(isIsomorph("title", "paper"));
    }

    public static boolean isIsomorph(String firstStr, String secondStr) {

        if (firstStr.length() == secondStr.length()) {
            Map <Character, Character> symbol = new HashMap<>();

            for (int i = 0; i < firstStr.length(); i++) {
                if (!symbol.containsKey(firstStr.charAt(i))) {
                    symbol.put(firstStr.charAt(i), secondStr.charAt(i));
                }
                else {
                    if (!symbol.get(firstStr.charAt(i)).equals(secondStr.charAt(i))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;

    }
}
