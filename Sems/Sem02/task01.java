package Sems.Sem02;

public class task01 {
    
/*
* Дано четное число N (>0) и символы c1 и c2.
* Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
*/

public static void main(String[] args) {
    System.out.println(buildString(6, 'a', 'b')); // ababab
    }
    
    
    private static String buildString(int n, char first, char second) {
    String result = new String();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                result += first;
            }
            else result += second;

        }


    return result;
    }

}

// OR