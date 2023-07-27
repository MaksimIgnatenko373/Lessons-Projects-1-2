package arrays;
 /* Задача. Аналогично с предыдущей.
 Увеличение массива на число number (Например, "n + 3").

*/

import java.util.Scanner;

public class ArrayPractice19CutEndArray {
    public static void main(String[] args) {
        int n = 5;
        int[] firstArray = new int[n];
        for (int i = 0; i < n; i++) {
            firstArray[i] = (int) (Math.random()* 10);
            System.out.println(firstArray[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество ячеек, которое вы хотите добавить!");

        int number = sc.nextInt();
        int[] secondArray = new int[n + number];
        for (int i = 0; i < n + number; i++) {
            secondArray[i] = (int) (Math.random()* 10);
        }
        for (int i = 0; i < n + number; i++) {
            System.out.println(secondArray[i]);
        }
    }
}
