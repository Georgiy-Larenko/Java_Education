package Hwk.Hwk02;

// 1. Создать метод, который проверяет, является ли строка палиндромом.

public class task01 {
    public static void main(String[] args) {
        String str = "XYBYBYX";
 
        if (isPalindrome(str)) {
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not Palindrome");
        }
    }

    public static boolean isPalindrome(String str)
    {
        if (str == null) {
            return false;
        }
 
        for (int i = 0, j = str.length() - 1; i < j; i++, j--)
        {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
 
        return true;
    }


}
