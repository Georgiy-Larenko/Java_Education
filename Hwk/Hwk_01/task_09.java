package Hwk.Hwk_01;

// Задание 9. Найти общий префикс среди слов из одного массива.
// ["aaa", "aab", "aa"] -> "aa", 

// ["abc", "bca", "cda"] -> ""


public class task_09 {
    public static void main(String[] args) {
        
        String[] stringArray = {"aaa", "aab", "aa"};
        System.out.println(findCommonPrefix(stringArray));      // aa
        String[] stringArray2 = {"abc", "bca", "cda"};
        System.out.println(findCommonPrefix(stringArray2));     // ""

    }

    private static String findCommonPrefix(String[] source) {

        int strLen = source.length;
        if (strLen == 0) return "";

        String prefix = source[0];

        for (int i = 1; i < strLen; i++)
        {
            while (source[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix == "") return "Prefix not found";
            }
        }

        return prefix;
        

    }

}
