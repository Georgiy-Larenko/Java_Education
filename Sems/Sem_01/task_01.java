package Sems.Sem_01;

/**
 * task_01
 */
public class task_01 {

    public static void main(String[] args) {
        print(new int[]{1, 1, 0, 1, 1, 1}); // 3
        print(new int[]{1, 1, 1, 1, 1, 1}); // 6
        print(new int[]{1, 1, 1, 1, 0, 0}); // 4 

        }
        
        /** 
        * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
        */
        private static void print(int[] array) {
            int count = 0;
            int temp = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) temp ++;
                else {
                    if (temp > count) count = temp;
                    temp = 0;
                }
                if (temp > count) count = temp;
            }
            System.out.println(count);
            
        }
}