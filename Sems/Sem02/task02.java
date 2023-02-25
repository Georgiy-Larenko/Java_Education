package Sems.Sem02;

// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. результат - a4b3cd2

public class task02 {
    public static void main(String[] args) {
        String str = "aaaabbbcdda";
        System.out.println(rleString(str)); // a4b3cd2
    }

    private static String rleString(String str) {
        String result = new String();
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result += str.charAt(i);
                if (count != 1) {
                    result += count;
                }
                count = 1;
            }

        }
        result += str.charAt(str.length() - 1);

        if (count != 1) {
            result += count;
        }

        return result;

    }
}
